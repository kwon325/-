package com.example.aksdi.capstonedesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Koryong on 15/11/2016.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
}