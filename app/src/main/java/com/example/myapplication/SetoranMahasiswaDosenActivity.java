package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class SetoranMahasiswaDosenActivity extends AppCompatActivity implements View.OnClickListener {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setoran_mahasiswa_dosen);
        View login;
        login = findViewById(R.id.btn_simpan);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_simpan){
            Intent moveIntent = new Intent(SetoranMahasiswaDosenActivity.this, RiwayatSetoranActivity.class);
            startActivity(moveIntent);
        }
    }
}