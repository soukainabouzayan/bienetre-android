package com.example.bienetre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HandMaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handmask);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}