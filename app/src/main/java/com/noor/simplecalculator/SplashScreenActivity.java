package com.noor.simplecalculator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    //duration of splash screen in mile second
    private static int SplashTimeOut=1000; //in mili seconds
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        actionBar =getSupportActionBar();
        actionBar.hide();


        //Post delayed for main activity
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                //After 4 seconds ,start this activity
                Intent intent=new Intent(SplashScreenActivity.this,CalculatorActivity.class);
                startActivity(intent);

                //closing this activity.
                finish();

            }
        }, SplashTimeOut);
    }
}
