package com.example.eeva1_aracely_cifuentes;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ve, he;
    Button calcula, limpia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ve = findViewById(R.id.tve);
        he = findViewById(R.id.the);
        calcula = findViewById(R.id.bcalcular);
        limpia = findViewById(R.id.blimpiar);

        calcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        pantallaresultado.class
                );
                int ver = Integer.parseInt(ve.getText().toString());
                int hec = Integer.parseInt(he.getText().toString());
                int sum = ver * hec;
                String sumaa = String.valueOf(sum);
                intent.putExtra("resultado",sumaa.toString());
                startActivity(intent);
            }
        });

        limpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // no c hcaer esto :ccc
                String vacio = "";
                ve.setText(vacio);
                he.setText(vacio);
            }
        });

    }
}