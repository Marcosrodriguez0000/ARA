package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pagina_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_1);

        // Inicializamos los botones de respuesta
        Button respuestaA = findViewById(R.id.checkBox1);
        Button respuestaB = findViewById(R.id.checkBox2);
        Button respuestaC = findViewById(R.id.checkBox3);
        Button respuestaD = findViewById(R.id.checkBox4);

        // Configuramos los listeners de los botones de respuesta
        respuestaA.setOnClickListener(v -> verificarRespuesta(false)); // Respuesta incorrecta
        respuestaB.setOnClickListener(v -> verificarRespuesta(true));  // Respuesta correcta
        respuestaC.setOnClickListener(v -> verificarRespuesta(false)); // Respuesta incorrecta
        respuestaD.setOnClickListener(v -> verificarRespuesta(false)); // Respuesta incorrecta
    }

    private void verificarRespuesta(boolean esCorrecta) {
        if (esCorrecta) {
            Intent intent = new Intent(pagina_1.this, pagina_2.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
        }
    }
}
