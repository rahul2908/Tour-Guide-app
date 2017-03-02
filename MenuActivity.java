package com.example.dell.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView hotels = (TextView) findViewById(R.id.hotels_text_view);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelIntent = new Intent(MenuActivity.this,HotelsActivity.class);
                startActivity(hotelIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurants_text_view);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MenuActivity.this,RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView places = (TextView) findViewById(R.id.places_text_view);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesIntent = new Intent(MenuActivity.this,PlacesActivity.class);
                startActivity(placesIntent);
            }
        });

        TextView gardens = (TextView) findViewById(R.id.gardens_text_view);
        gardens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gardensIntent = new Intent(MenuActivity.this,GardensActivity.class);
                startActivity(gardensIntent);
            }
        });


    }
}
