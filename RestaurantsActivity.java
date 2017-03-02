package com.example.dell.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Rustic Door",R.drawable.rustic_door));
        tours.add(new Tour("Kylin",R.drawable.kylin));
        tours.add(new Tour("Pirates Of Grill",R.drawable.pirates_of_grill));
        tours.add(new Tour("Mainland China",R.drawable.mainland_china));
        tours.add(new Tour("Swagath Restaurant",R.drawable.swagath_restaurant));
        tours.add(new Tour("Whistling Duck",R.drawable.whistling_duck));
        tours.add(new Tour("PAL Dhaba",R.drawable.pal_dhaba));
        tours.add(new Tour("Gopal Sweets",R.drawable.gopals_sweets_chandigarh));
        tours.add(new Tour("Sindhi Sweets",R.drawable.sindhi_sweets_chandigarh));
        tours.add(new Tour("Buffet Hut",R.drawable.buffet_hut));

        for(int index = 0; index < tours.size(); index++) {
            Log.v("RestaurantsActivity", "Tour at index "+index + ": " + tours.get(index));
        }

        TourAdapter adapter = new TourAdapter(this,tours,R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.activity_restaurants);
        listView.setAdapter(adapter);

    }
}
