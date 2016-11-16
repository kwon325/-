package com.example.aksdi.capstonedesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
    public void login(View view)
    {
        Intent login_intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(login_intent);

    }
    public void signup(View view)
    {
        Intent login_intent = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(login_intent);

    }
    public void post(View view)
    {
        Intent login_intent = new Intent(MainActivity.this, PostActivity.class);
        startActivity(login_intent);

    }
    public void mypage(View view)
    {
        Intent login_intent = new Intent(MainActivity.this, MypageActivity.class);
        startActivity(login_intent);

    }
}