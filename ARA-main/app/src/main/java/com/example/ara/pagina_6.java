package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class pagina_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_6);  // Layout correcto

        // Inicializamos los botones de respuesta
        Button respuestaA = findViewById(R.id.checkBox20); // Respuesta incorrecta
        Button respuestaB = findViewById(R.id.checkBox21); // Respuesta incorrecta
        Button respuestaC = findViewById(R.id.checkBox22); // Respuesta correcta
        Button respuestaD = findViewById(R.id.checkBox23); // Respuesta incorrecta

        // Configuramos los listeners de los botones de respuesta
        respuestaA.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaB.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
        respuestaC.setOnClickListener(v -> verificarRespuesta(true));   // Respuesta correcta
        respuestaD.setOnClickListener(v -> verificarRespuesta(false));  // Respuesta incorrecta
    }

    private void verificarRespuesta(boolean esCorrecta) {
        if (esCorrecta) {
            // Si la respuesta es correcta, vamos a la siguiente página
            Intent intent = new Intent(pagina_6.this, pagina_7.class); // Cambia a la página siguiente
            startActivity(intent);
        } else {
            // Si la respuesta es incorrecta, mostramos un mensaje
            Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
        }
    }
}
