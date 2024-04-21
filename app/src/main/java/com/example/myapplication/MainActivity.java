package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner spinner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi Spinner
        spinner = findViewById(R.id.spinner);

        // Buat array nilai untuk Spinner
        String[] spinnerValues = {"Mahasiswa", "Dosen"};

        // Buat adapter untuk Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, spinnerValues);

        // Tentukan tata letak saat dropdown muncul
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Atur adapter ke Spinner
        spinner.setAdapter(adapter);

        // Inisialisasi tombol login dan tambahkan listener
        View login = findViewById(R.id.btn_login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_login) {
            // Ambil nilai yang dipilih dari Spinner
            String selectedValue = spinner.getSelectedItem().toString();

            // Cek nilai yang dipilih
            if (selectedValue.equals("Mahasiswa")) {
                // Kirim pengguna ke RiwayatActivity
                Intent moveIntent = new Intent(MainActivity.this, MahasiswaActivity.class);
                moveIntent.putExtra("SELECTED_VALUE", selectedValue);
                startActivity(moveIntent);
            } else if (selectedValue.equals("Dosen")) {
                // Kirim pengguna ke DosenActivity
                Intent moveIntent = new Intent(MainActivity.this, DosenActivity.class);
                moveIntent.putExtra("SELECTED_VALUE", selectedValue);
                startActivity(moveIntent);
            }
        }
    }


}
