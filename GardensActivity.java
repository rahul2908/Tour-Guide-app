package com.example.dell.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class GardensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardens);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Rose Garden",R.drawable.rose_garden));
        tours.add(new Tour("Rock Garden",R.drawable.rock_garden));
        tours.add(new Tour("Children Traffic Park",R.drawable.children_traffic_park));
        tours.add(new Tour("Butterfly Park",R.drawable.butterfly_park));
        tours.add(new Tour("Japenese Garden",R.drawable.japenese_garden));
        tours.add(new Tour("Garden Of Fragrance",R.drawable.garden_of_fragrance));
        tours.add(new Tour("Rajiv Gandhi Technology Park",R.drawable.rajiv_gandhi_park));
        tours.add(new Tour("Terraced Garden",R.drawable.garden_terrace));
        tours.add(new Tour("Shanti Kunj Park",R.drawable.shanti_kunj_park));
        tours.add(new Tour("Yadavindra Garden Pinjore",R.drawable.yadavindra_garden_pinjore));

        for(int index = 0; index < tours.size(); index++) {
            Log.v("GardensActivity", "Tour at index "+index + ": " + tours.get(index));
        }

        TourAdapter adapter = new TourAdapter(this,tours,R.color.category_gardens);

        ListView listView = (ListView) findViewById(R.id.activity_gardens);
        listView.setAdapter(adapter);
    }
}
