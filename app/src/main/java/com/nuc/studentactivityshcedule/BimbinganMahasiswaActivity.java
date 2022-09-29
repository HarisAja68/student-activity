package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BimbinganMahasiswaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimbingan_mahasiswa);
    }

    public void Dashboard(View view) {
        Intent intent = new Intent(BimbinganMahasiswaActivity.this, DashboardActivity.class);
        startActivity(intent);
    }

    public void bimbinganta(View view) {
        Intent intent = new Intent(BimbinganMahasiswaActivity.this, ValidasiBimbinganTaActivity.class);
        startActivity(intent);
    }
    public void bimbingankp(View view) {
        Intent intent = new Intent(BimbinganMahasiswaActivity.this, ValidasiBimbinganKpActivity.class);
        startActivity(intent);
    }
}