package com.example.lesson12android3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected EditText editName;
    protected EditText editSurname;
    protected Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
        editSurname = findViewById(R.id.editSurname);
        btnLogin = findViewById(R.id.btnLogin);

        if (!PreferencesUtils.getYourName().isEmpty()) {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        }

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PreferencesUtils.saveYourName(editSurname.getText().toString().trim());
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });


    }
}