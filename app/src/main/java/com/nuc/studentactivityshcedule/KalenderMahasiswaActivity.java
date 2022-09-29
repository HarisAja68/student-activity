package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KalenderMahasiswaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalender_mahasiswa);
    }

    public void Dashboard(View view) {
        Intent intent = new Intent(KalenderMahasiswaActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
}