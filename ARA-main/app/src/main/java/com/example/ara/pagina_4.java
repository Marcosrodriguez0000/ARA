package com.example.ara;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pagina_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_4); // Asegúrate de que el layout se llame pagina_4.xml

        // Inicializamos los botones de respuesta
        Button respuestaA = findViewById(R.id.checkBox12);
        Button respuestaB = findViewById(R.id.checkBox13);
        Button respuestaC = findViewById(R.id.checkBox14); // Respuesta correcta
        Button respuestaD = findViewById(R.id.checkBox15);

        // Configuramos los listeners de los botones de respuesta
        respuestaA.setOnClickListener(v -> verificarRespuesta(false));
        respuestaB.setOnClickListener(v -> verificarRespuesta(false));
        respuestaC.setOnClickListener(v -> verificarRespuesta(true)); // Respuesta correcta
        respuestaD.setOnClickListener(v -> verificarRespuesta(false));
    }

    private void verificarRespuesta(boolean esCorrecta) {
        if (esCorrecta) {
            Intent intent = new Intent(pagina_4.this, pagina_5.class); // Redirige a la página siguiente
            startActivity(intent);
        } else {
            Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
        }
    }
}
