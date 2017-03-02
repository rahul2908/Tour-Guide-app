package com.example.dell.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Rock Garden",R.drawable.rock_garden));
        tours.add(new Tour("Sukna Lake",R.drawable.sukhna_lake));
        tours.add(new Tour("Kalagram",R.drawable.kalagram));
        tours.add(new Tour("Elante Mall",R.drawable.elante_mall));
        tours.add(new Tour("Open Hand Monument",R.drawable.open_hand_monument));
        tours.add(new Tour("Child Art Gallery",R.drawable.child_art_gallery));
        tours.add(new Tour("Government Museum",R.drawable.govt_museum));
        tours.add(new Tour("Dolls Museum",R.drawable.dolls_museum));
        tours.add(new Tour("Chattbir Zoo",R.drawable.chattbir_zoo));
        tours.add(new Tour("DT Mall",R.drawable.the_dt_mall));

        for(int index = 0; index < tours.size(); index++) {
            Log.v("PlacesActivity", "Tour at index "+index + ": " + tours.get(index));
        }

        TourAdapter adapter = new TourAdapter(this,tours,R.color.category_places);

        ListView listView = (ListView) findViewById(R.id.activity_places);
        listView.setAdapter(adapter);

    }
}
