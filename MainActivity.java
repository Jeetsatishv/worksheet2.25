package com.example.assignment225;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText password1, password2;
     TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password1 = findViewById(R.id.editTextTextPassword);
        password2 = findViewById(R.id.editTextTextPassword2);
        result = (TextView) findViewById(R.id.textView);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifier(password1, password2);
            }
        });

    }

    private boolean verifier(EditText password1, EditText password2) {
        String pass1 = password1.getText().toString();
        String pass2 = password2.getText().toString();
        if (pass1.equals(pass2)) {
            result.setText("The passwords match");
            result.setBackgroundColor(-16711936);
            return true;
        } else {
            result.setText("The password does not match");
            result.setBackgroundColor(-65536);

            return false;
        }
    }



}