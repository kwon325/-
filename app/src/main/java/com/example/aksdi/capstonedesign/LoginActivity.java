package com.example.aksdi.capstonedesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Koryong on 2016. 11. 15..
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
    }
    public void login_done(View view)
    {
        finish();
    }
    public void signup_go(View view)
    {
        Intent login_intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(login_intent);

    }
}
