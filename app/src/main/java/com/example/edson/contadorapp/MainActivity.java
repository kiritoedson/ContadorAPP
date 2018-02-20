package com.example.edson.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button incrementa, quita, reset;
    public TextView texto;
    public int conteo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementa = findViewById(R.id.Incre);
        quita = findViewById(R.id.Quita);
        reset = findViewById(R.id.Reset);
        texto = findViewById(R.id.TxtView);
        conteo = 0;

        incrementa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementa();
            }
        });

        quita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitar();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();

            }
        });
    }

    public void incrementa() {
        conteo++;
        muetra();
    }

    public void quitar() {
        conteo--;
        muetra();
    }

    public void reset() {
        conteo = 0;
        muetra();
    }

    public void muetra() {
        texto.setText("Conteo: " + conteo);

    }
}
