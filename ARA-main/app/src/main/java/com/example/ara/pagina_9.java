package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class pagina_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_9);  // Layout correspondiente

        // Inicializamos los botones de respuesta
        Button respuestaA = findViewById(R.id.checkBox32); // Respuesta incorrecta
        Button respuestaB = findViewById(R.id.checkBox33); // Respuesta correcta
        Button respuestaC = findViewById(R.id.checkBox34); // Respuesta incorrecta
        Button respuestaD = findViewById(R.id.checkBox35); // Respuesta incorrecta

        // Configuramos los listeners de los botones de respuesta
        respuestaA.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaB.setOnClickListener(v -> verificarRespuesta(true));   // Respuesta correcta
        respuestaC.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaD.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
    }

    private void verificarRespuesta(boolean esCorrecta) {
        if (esCorrecta) {
            // Si la respuesta es correcta, vamos a la siguiente página
            Intent intent = new Intent(pagina_9.this, pagina_10.class); // Cambiar a la siguiente página
            startActivity(intent);
        } else {
            // Si la respuesta es incorrecta, mostramos un mensaje
            Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
        }
    }
}
