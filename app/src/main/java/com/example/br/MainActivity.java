package com.example.br;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextText, editTextText2;
    RadioButton radioButton, radioButton2, radioButton3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        btn1 = findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    final Double n1 = Double.parseDouble(editTextText.getText().toString());
                    final Double n2 = Double.parseDouble(editTextText2.getText().toString());
                    Double resulta = 0.0;

                    if (radioButton.isChecked()) {
                        resulta = n1 + n2;
                    }
                    if (radioButton2.isChecked()) {
                        resulta = n1 - n2;
                    }
                    if (radioButton3.isChecked()) {
                        resulta = n1 * n2;
                    }

                    Toast.makeText(MainActivity.this, String.valueOf(resulta), Toast.LENGTH_SHORT).show();
                }
        });
    }
}