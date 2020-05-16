package com.example.utsakb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/*

    Nama                : Dirza Aulia
    NIM                 : 10118705
    Kelas               : IF-6K
    Tanggal Pengerjaan  : 16 Mei 2020

 */

public class HomeActivity extends AppCompatActivity {

    TextView textViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bindViews();

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String umur = intent.getStringExtra("umur");
        String jenis_kelamin = intent.getStringExtra("jenis_kelamin");

        String textHome = nama + " " + jenis_kelamin + " " + umur + " tahun Berhasil Ditambahkan\nSilahkan Gunakan Kode Ini Untuk Masuk Kedalam Aplikasi Anak ";

        textViewHome.setText(textHome);
    }

    private void bindViews(){

        textViewHome = findViewById(R.id.text_view_home);
    }
}
