package com.example.eeva1_aracely_cifuentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pantallaresultado extends AppCompatActivity {

    TextView resultadorecibido;

    Button vo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaresultado);

        vo = findViewById(R.id.bvolver);

        resultadorecibido = findViewById(R.id.textoresult);
        String resultado = getIntent().getStringExtra("resultado");
        resultadorecibido.setText(resultado);

        vo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainActivity.class
                );
                //???????? funciona así :D
                startActivity(intent);
            }
        });
    }
}