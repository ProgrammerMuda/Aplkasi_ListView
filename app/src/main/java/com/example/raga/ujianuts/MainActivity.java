package com.example.raga.ujianuts;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler adphandler = new Handler();
        Runnable adprunnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, menu.class));
            }
        };

        adphandler.postDelayed(adprunnable, 5000);
    }
}

