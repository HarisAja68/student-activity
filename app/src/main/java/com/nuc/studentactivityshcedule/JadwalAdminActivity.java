package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JadwalAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_admin);
    }
    public void Dashboard(View view) {
        Intent intent = new Intent(JadwalAdminActivity.this, DashboardAdminActivity.class);
        startActivity(intent);
    }
}