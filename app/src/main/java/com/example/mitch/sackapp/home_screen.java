package com.example.mitch.sackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void toConsent(View view) {
        Intent intent = new Intent(this, consent_screen.class);
        startActivity(intent);
    }

    public void toResources(View view) {
        Intent intent = new Intent( this, resources_screen.class);
        startActivity(intent);
    }

}
