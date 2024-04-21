package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RiwayatSetoranActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvRiwayat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_setoran);




    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_simpan){
            Intent moveIntent = new Intent(RiwayatSetoranActivity.this, LogoutDosenMahasiswaActivity.class);
            startActivity(moveIntent);
        }
    }}