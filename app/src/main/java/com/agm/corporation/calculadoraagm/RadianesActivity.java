package com.agm.corporation.calculadoraagm;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RadianesActivity extends AppCompatActivity implements View.OnFocusChangeListener {

    private EditText editTextXRad;
    private EditText editTextYRad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radianes);
        editTextXRad = findViewById(R.id.editTextNumberXRad);
        editTextYRad = findViewById(R.id.editTextNumberYRad);
        editTextXRad.setOnFocusChangeListener(this);
        editTextYRad.setOnFocusChangeListener(this);
    }

    @Override
    public void onFocusChange(View view, boolean hasFocus) {
        if(!hasFocus) {
            realizaOperacion();
        }
    }

    private void realizaOperacion() {

        if(editTextXRad.getText().toString() != null) {
            if(isDouble(editTextXRad.getText().toString())) {
                double deg = Math.toRadians(getDouble(editTextXRad.getText().toString()));
                editTextYRad.setText(String.valueOf(deg));
            }
        }

    }

    private double getDouble(String entero) {
        try {
            return Double.parseDouble(entero);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }
    private boolean isDouble(String entero) {
        try {
            if(entero == null || entero.length() == 0) {
                return false;
            }
            Double.parseDouble(entero);
            return true;
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        return false;
    }
}