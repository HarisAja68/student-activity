package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void Bimbingan(View view) {
        Intent intent = new Intent(DashboardActivity.this, BimbinganMahasiswaActivity.class);
        startActivity(intent);
    }

    public void Jadwal(View view) {
        Intent intent = new Intent(DashboardActivity.this, JadwalMahasiswaActivity.class);
        startActivity(intent);
    }

    public void Kalender(View view) {
        Intent intent = new Intent(DashboardActivity.this, KalenderMahasiswaActivity.class);
        startActivity(intent);
    }

    public void Keluar(View view) {
        Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
        startActivity(intent);
    }

}