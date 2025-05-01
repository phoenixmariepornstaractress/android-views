package com.zarinpal.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zarinpal.libs.views.ZarinTimer;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupTimer();
    }

    private void setupTimer() {
        ZarinTimer timer = findViewById(R.id.timer);

        if (timer != null) {
            timer.startTimer(time -> Log.d(TAG, "Timer running: " + time));

            timer.setOnTimeCompleteListener(() -> Log.d(TAG, "Timer finished successfully."));
        } else {
            Log.e(TAG, "Timer view not found. Please check layout.");
        }
    }
}
