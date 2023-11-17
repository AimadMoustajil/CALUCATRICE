package com.example.br;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView te;
    Button btn4 ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        te  = findViewById(R.id.textView);
        btn4 = findViewById(R.id.button3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("About this application ");

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}