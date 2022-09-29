package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Dashboard(View view) {
        Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
        startActivity(intent);
    }

    public void DashboardAdmin(View view) {
        Intent intent = new Intent(MainActivity.this, DashboardAdminActivity.class);
        startActivity(intent);
    }

}