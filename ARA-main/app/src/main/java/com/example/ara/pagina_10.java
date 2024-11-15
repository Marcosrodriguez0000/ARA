package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class pagina_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_10);  // Layout correspondiente

        // Inicializamos los botones de respuesta
        Button respuestaA = findViewById(R.id.button36);
        Button respuestaB = findViewById(R.id.button37);
        Button respuestaC = findViewById(R.id.button38);
        Button respuestaD = findViewById(R.id.button39);

        // Configuramos los listeners de los botones de respuesta
        respuestaA.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaB.setOnClickListener(v -> verificarRespuesta(true));   // Respuesta correcta
        respuestaC.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaD.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
    }

    private void verificarRespuesta(boolean esCorrecta) {
        if (esCorrecta) {
            // Si la respuesta es correcta, redirige a la página de fin del juego
            Intent intent = new Intent(pagina_10.this, FinJuegoActivity.class); // Redirigir a la actividad de fin del juego
            startActivity(intent);
        } else {
            // Si la respuesta es incorrecta, mostramos un mensaje
            Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
        }
    }
}
