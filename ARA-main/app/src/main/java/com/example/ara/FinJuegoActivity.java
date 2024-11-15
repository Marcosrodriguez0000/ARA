package com.example.ara;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class FinJuegoActivity extends AppCompatActivity {

    private ImageView backgroundImage;
    private TextView textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finjuego);

        // Initialize the views
        backgroundImage = findViewById(R.id.backgroundImage);
        textView10 = findViewById(R.id.textView10);

        // You can add additional logic here if needed
    }
}