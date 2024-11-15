package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonIniciar = findViewById(R.id.iniciar);
        botonIniciar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, pagina_1.class);
            startActivity(intent);
        });
    }
}
