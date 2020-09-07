package com.example.quakereport;

import android.os.Bundle;

import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<EarthQuake> earthquakes = QueryUtils.extractEarthquakes();
        ListView earthQuakeListview = (ListView) findViewById(R.id.list);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);
        earthQuakeListview.setAdapter(adapter);
    }

}

