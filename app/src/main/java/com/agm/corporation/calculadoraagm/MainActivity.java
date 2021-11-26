package com.agm.corporation.calculadoraagm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;
    private Button buttonResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSuma = findViewById(R.id.buttonSuma );
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSuma( );
            }
        });
        buttonResta = findViewById(R.id.buttonResta );
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirResta( );
            }
        });
        buttonResta = findViewById(R.id.buttonMultiplicacion );
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMultiplicacion( );
            }
        });
        buttonResta = findViewById(R.id.buttonDivision );
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDivision( );
            }
        });
    }

    private void abrirSuma() {
        Intent intent = new Intent( this , SumaActivity.class );
        startActivity( intent );
    }

    private void abrirResta() {
        Intent intent = new Intent( this , RestaActivity.class );
        startActivity( intent );
    }
    private void abrirMultiplicacion() {
        Intent intent = new Intent( this , MultiplicacionActivity.class );
        startActivity( intent );
    }
    private void abrirDivision() {
        Intent intent = new Intent( this , DivisionActivity.class );
        startActivity( intent );
    }

}