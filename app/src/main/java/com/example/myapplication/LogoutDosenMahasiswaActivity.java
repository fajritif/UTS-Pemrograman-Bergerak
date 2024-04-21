package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class LogoutDosenMahasiswaActivity extends AppCompatActivity implements View.OnClickListener {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        View login;
        login = findViewById(R.id.buttonYa);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonYa){
            Intent moveIntent = new Intent(LogoutDosenMahasiswaActivity.this, MainActivity.class);
            startActivity(moveIntent);
        }
    }
}