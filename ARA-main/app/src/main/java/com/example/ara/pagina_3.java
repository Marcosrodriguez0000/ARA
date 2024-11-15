package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pagina_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_3); // Layout correcto

        // Inicializamos los botones de respuesta
        Button respuestaA = findViewById(R.id.checkBox8);  // Respuesta correcta
        Button respuestaB = findViewById(R.id.checkBox9);
        Button respuestaC = findViewById(R.id.checkBox10);
        Button respuestaD = findViewById(R.id.checkBox11);

        // Configuramos los listeners de los botones de respuesta
        respuestaA.setOnClickListener(v -> verificarRespuesta(true)); // Respuesta correcta
        respuestaB.setOnClickListener(v -> verificarRespuesta(false));
        respuestaC.setOnClickListener(v -> verificarRespuesta(false));
        respuestaD.setOnClickListener(v -> verificarRespuesta(false));
    }

    private void verificarRespuesta(boolean esCorrecta) {
        if (esCorrecta) {
            Intent intent = new Intent(pagina_3.this, pagina_4.class);
            startActivity(intent); // Redirige a pagina_4
        } else {
            Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
        }
    }
}
