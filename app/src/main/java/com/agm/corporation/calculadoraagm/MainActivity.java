package com.agm.corporation.calculadoraagm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;
    private Button buttonResta;
    private Button buttonMultiplicacion;
    private Button buttonDivision;
    private Button buttonPropina;
    private Button buttonRadianes;
    private Button buttonHipotenusa;
    private Button buttonCoseno;
    private Button buttonMetrosPies;


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
        buttonMultiplicacion = findViewById(R.id.buttonMultiplicacion );
        buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMultiplicacion( );
            }
        });
        buttonDivision = findViewById(R.id.buttonDivision );
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDivision( );
            }
        });
        buttonPropina = findViewById(R.id.buttonPropina );
        buttonPropina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPropina( );
            }
        });
        buttonRadianes = findViewById(R.id.buttonRadianes );
        buttonRadianes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirRadianes( );
            }
        });
        buttonHipotenusa = findViewById(R.id.buttonHipotenusa );
        buttonHipotenusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirHipotenusa( );
            }
        });
        buttonCoseno = findViewById(R.id.buttonCoseno );
        buttonCoseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCoseno( );
            }
        });
        buttonMetrosPies = findViewById(R.id.buttonMetrosPies );
        buttonMetrosPies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMetrosPies( );
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
    private void abrirPropina() {
        Intent intent = new Intent( this , PropinaActivity.class );
        startActivity( intent );
    }
    private void abrirRadianes() {
        Intent intent = new Intent( this , RadianesActivity.class );
        startActivity( intent );
    }
    private void abrirHipotenusa() {
        Intent intent = new Intent( this , HipotenusaActivity.class );
        startActivity( intent );
    }
    private void abrirCoseno() {
        Intent intent = new Intent( this , CosenoActivity.class );
        startActivity( intent );
    }
    private void abrirMetrosPies() {
        Intent intent = new Intent( this , MetrosPiesActivity.class );
        startActivity( intent );
    }
}