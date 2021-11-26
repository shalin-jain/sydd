package edu.gatech.sjain441.sydd;

import java.io.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    Home home = new Home();
    Map map = new Map();
    Notes notes = new Notes();
    Calendar calendar = new Calendar();
    Graph graph = new Graph();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home_page);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home_page:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, home).commit();
                return true;

            case R.id.map:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, map).commit();
                return true;

            case R.id.notes:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, notes).commit();
                return true;

            case R.id.calendar:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, calendar).commit();
                return true;

            case R.id.graph:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, graph).commit();
                return true;
        }
        return false;
    }
}
