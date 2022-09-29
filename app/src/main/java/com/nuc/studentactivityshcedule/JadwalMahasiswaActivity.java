package com.nuc.studentactivityshcedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Spinner;
import android.view.View;
import android.graphics.Typeface;
import android.widget.AdapterView;
import android.widget.Toast;


public class JadwalMahasiswaActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_mahasiswa);

        spinner = (Spinner) findViewById(R.id.spinner);
//        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/poppinsbold.ttf");
//        spinner.setTypeface(typeface);
        spinner.setOnItemSelectedListener(new ItemSelectedListener());

    }

    public void Dashboard(View view) {
        Intent intent = new Intent(JadwalMahasiswaActivity.this, DashboardActivity.class);
        startActivity(intent);
    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {



        //get strings of first item

        String firstItem = String.valueOf(spinner.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            if (firstItem.equals(String.valueOf(spinner.getSelectedItem()))) {

            } else {

                Toast.makeText(parent.getContext(),

                        "Anda telah memilih : " + parent.getItemAtPosition(pos).toString(),

                        Toast.LENGTH_LONG).show();

            }

        }

        @Override

        public void onNothingSelected(AdapterView<?> arg) {


        }

    }
}