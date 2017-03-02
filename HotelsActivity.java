package com.example.dell.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("JW Marroit",R.drawable.jw_marriot));
        tours.add(new Tour("Hotel Mountview",R.drawable.hotel_mountview));
        tours.add(new Tour("Taj Hotel",R.drawable.taj_hotel));
        tours.add(new Tour("Hyatt Hotel",R.drawable.hyatt_hotel));
        tours.add(new Tour("Hotel City Heart",R.drawable.hotel_city_heart_premium));
        tours.add(new Tour("Lemon Tea Hotel",R.drawable.lemon_tea_hotel));
        tours.add(new Tour("The TOY Hotel",R.drawable.the_toy_hotel));
        tours.add(new Tour("The Bella Vista Hotel",R.drawable.the_bella_vista_hotel));
        tours.add(new Tour("Hotel Sunbeam",R.drawable.hotel_sunbeam_premium));
        tours.add(new Tour("Hoel Cama",R.drawable.hotel_cama));

        for(int index = 0; index < tours.size(); index++) {
            Log.v("HotelsActivity", "Tour at index "+index + ": " + tours.get(index));
        }

        TourAdapter adapter = new TourAdapter(this,tours,R.color.category_hotels);

        ListView listView = (ListView) findViewById(R.id.activity_hotels);
        listView.setAdapter(adapter);

    }

}
