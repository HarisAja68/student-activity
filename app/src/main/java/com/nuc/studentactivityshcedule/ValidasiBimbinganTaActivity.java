package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ValidasiBimbinganTaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi_bimbingan_ta);
    }

    public void Dashboard(View view) {
        Intent intent = new Intent(ValidasiBimbinganTaActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
}