package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class RiwayatActivity extends AppCompatActivity implements View.OnClickListener {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        View login;
        login = findViewById(R.id.button_selanjutnya);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_selanjutnya){
            Intent moveIntent = new Intent(RiwayatActivity.this, SetoranActivity.class);
            startActivity(moveIntent);
        }
    }
}