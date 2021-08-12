package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                String value = editText.getText().toString();
                if(value.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter Some Value", Toast.LENGTH_SHORT).show();
                } else {
                    int val = Integer.parseInt(value);
                    for (int i = 1; i <= 10; i++) {
                        textView.append(value + " * " + i + " = " + i*val + "\n");
                    }
                }
            }
        });
    }
}