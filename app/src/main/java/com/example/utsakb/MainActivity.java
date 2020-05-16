package com.example.utsakb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/*

    Nama                : Dirza Aulia
    NIM                 : 10118705
    Kelas               : IF-6K
    Tanggal Pengerjaan  : 16 Mei 2020

 */


public class MainActivity extends AppCompatActivity {

    EditText editTextNama, editTextUmur;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button buttonDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();

        buttonDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedRadioButton = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedRadioButton);

                String nama = editTextNama.getText().toString().trim();
                String umur = editTextUmur.getText().toString().trim();
                String jenis_kelamin = radioButton.getText().toString().trim();

                Intent intent = new Intent(getBaseContext(), HomeActivity.class);
                intent.putExtra("nama", nama);
                intent.putExtra("umur", umur);
                intent.putExtra("jenis_kelamin", jenis_kelamin);
                startActivity(intent);
            }
        });
    }

    private void bindViews(){

        editTextNama = findViewById(R.id.edit_text_nama_panggilan);
        editTextUmur = findViewById(R.id.edit_text_umur);
        radioGroup = findViewById(R.id.radio_group);
        buttonDaftar = findViewById(R.id.button_daftar);
    }
}
