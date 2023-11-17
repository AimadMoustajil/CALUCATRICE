package com.example.br;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView te;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        te  = findViewById(R.id.textView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}