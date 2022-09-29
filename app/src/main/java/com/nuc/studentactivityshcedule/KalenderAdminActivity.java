package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KalenderAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalender_admin);
    }

    public void Dashboard(View view) {
        Intent intent = new Intent(KalenderAdminActivity.this, DashboardAdminActivity.class);
        startActivity(intent);
    }
}