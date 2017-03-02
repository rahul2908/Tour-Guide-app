package com.example.dell.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void welcome(View view){
        Intent welcomeItntent = new Intent(MainActivity.this,MenuActivity.class);
        startActivity(welcomeItntent);
    }
}
