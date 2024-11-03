package com.example.helloworld;

import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onButtonClick(View v) {
        Log.d("COMP3018mdp", "button pressed!");
        final EditText numberOne = (EditText) findViewById(R.id.editTextNumber1);
        int One = Integer.parseInt(numberOne.getText().toString());
        final EditText numberTwo = (EditText) findViewById(R.id.editTextNumber2);
        int Two = Integer.parseInt(numberTwo.getText().toString());
        int sum = One + Two;
        final EditText resultView = (EditText) findViewById(R.id.editTextNumber3);
        resultView.setText(String.valueOf(sum));
    }
}