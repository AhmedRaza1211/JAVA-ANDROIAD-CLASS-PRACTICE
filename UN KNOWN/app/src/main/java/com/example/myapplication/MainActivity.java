package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    EditText emailEt;
    EditText passwordEt;
    TextInputLayout emailTil;
    TextInputLayout passwordTil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        emailEt = findViewById(R.id.emaitEt);
        passwordEt = findViewById(R.id.passwordEt);
        emailTil = findViewById(R.id.emailTil);
        passwordTil = findViewById(R.id.passwordTil);
    }

    public void login(View view) {
        getDetails_nextPage();

    }

    private void getDetails_nextPage() {
        String email = emailEt.getText().toString();
        String password = passwordEt.getText().toString();

        if (email.isEmpty()){
            emailTil.setError("Email Required");
        }
        else if(password.isEmpty()){
            passwordEt.setError("Password Required");
        }
        else{
            Intent homeIntent = new Intent(MainActivity.this, HomeScreen.class);
            homeIntent.putExtra("email", email);
            homeIntent.putExtra("password", password);
            startActivity(homeIntent);
            Toast.makeText(this, email+password, Toast.LENGTH_SHORT).show();
        }
    }


}
