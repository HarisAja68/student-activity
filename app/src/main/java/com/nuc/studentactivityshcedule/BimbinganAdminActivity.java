package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BimbinganAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimbingan_admin);
    }

    public void Dashboard(View view) {
        Intent intent = new Intent(BimbinganAdminActivity.this, DashboardAdminActivity.class);
        startActivity(intent);
    }
}