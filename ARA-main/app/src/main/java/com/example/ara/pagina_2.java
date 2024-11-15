package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pagina_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_2);

        // Inicializamos los botones de respuesta
        Button respuestaA = findViewById(R.id.checkBox);
        Button respuestaB = findViewById(R.id.checkBox5);  // Respuesta correcta
        Button respuestaC = findViewById(R.id.checkBox6);
        Button respuestaD = findViewById(R.id.checkBox7);

        // Configuramos los listeners de los botones de respuesta
        respuestaA.setOnClickListener(v -> verificarRespuesta(false));
        respuestaB.setOnClickListener(v -> verificarRespuesta(true));  // Respuesta correcta
        respuestaC.setOnClickListener(v -> verificarRespuesta(false));
        respuestaD.setOnClickListener(v -> verificarRespuesta(false));
    }

    private void verificarRespuesta(boolean esCorrecta) {
        if (esCorrecta) {
            Intent intent = new Intent(pagina_2.this, pagina_3.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
        }
    }
}
