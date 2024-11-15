package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class pagina_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_8);  // Layout correcto

        // Inicializamos los botones de respuesta
        Button respuestaA = findViewById(R.id.checkBox28); // Respuesta incorrecta
        Button respuestaB = findViewById(R.id.checkBox29); // Respuesta incorrecta
        Button respuestaC = findViewById(R.id.checkBox30); // Respuesta incorrecta
        Button respuestaD = findViewById(R.id.checkBox31); // Respuesta correcta

        // Configuramos los listeners de los botones de respuesta
        respuestaA.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaB.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaC.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaD.setOnClickListener(v -> verificarRespuesta(true));   // Respuesta correcta
    }

    private void verificarRespuesta(boolean esCorrecta) {
        if (esCorrecta) {
            // Si la respuesta es correcta, vamos a la siguiente página
            Intent intent = new Intent(pagina_8.this, pagina_9.class); // Cambia a la página siguiente
            startActivity(intent);
        } else {
            // Si la respuesta es incorrecta, mostramos un mensaje
            Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
        }
    }
}
