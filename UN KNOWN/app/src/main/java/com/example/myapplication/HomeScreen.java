package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
TextView emailTtv;
TextView passwordTtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        emailTtv = findViewById(R.id.emailTv);
        passwordTtv = findViewById(R.id.passwordTv);

        Bundle bundle = getIntent().getExtras();
        String emailInit = bundle.getString("email");
        String passwordInit = bundle.getString("password");

        emailTtv.setText(emailInit);
        passwordTtv.setText(passwordInit);


    }
}
