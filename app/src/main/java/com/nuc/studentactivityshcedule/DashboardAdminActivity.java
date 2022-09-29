package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_admin);
    }

    public void Bimbingan(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this, BimbinganAdminActivity.class);
        startActivity(intent);
    }

    public void Jadwal(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this, JadwalAdminActivity.class);
        startActivity(intent);
    }

    public void Kalender(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this, KalenderAdminActivity.class);
        startActivity(intent);
    }

    public void Keluar(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this, MainActivity.class);
        startActivity(intent);
    }
}