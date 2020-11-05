package com.example.astroweather;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.my_toolbar));
        getSupportActionBar().setElevation(0);

        ViewPager2 viewPager2 = findViewById(R.id.viewPager);
        ViewPager2Adapter viewPager2Adapter = new ViewPager2Adapter(getSupportFragmentManager(), getLifecycle());
        viewPager2Adapter.addFragment(new MoonFragment());
        viewPager2Adapter.addFragment(new SunFragment());
        viewPager2.setAdapter(viewPager2Adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.btnSettings) {
            Toast.makeText(getApplicationContext(), "ELOOO", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}



