package com.example.astroweather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setSupportActionBar(findViewById(R.id.my_toolbar2));
        getSupportActionBar().setTitle("Settings");

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mFragment, new SettingsFragment())
                .commit();

    }
}
