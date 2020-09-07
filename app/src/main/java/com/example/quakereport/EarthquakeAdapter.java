package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<EarthQuake> {
    public EarthquakeAdapter(@NonNull Context context, ArrayList<EarthQuake> resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }
        EarthQuake currentEarthQuake = getItem(position);


        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);

        magnitudeView.setText(currentEarthQuake.getmMagnitude());


        TextView  locationView = (TextView) listItemView.findViewById(R.id.location);

        locationView.setText(currentEarthQuake.getmLocation());


        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthQuake.getmDate());
        return listItemView;
    }
}
