package com.example.yefrigaitan.phocus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;


/**
 * Created by yefrigaitan on 1/20/18.
 */

public class PhocusMain extends AppCompatActivity {
    private long START_IN_MS = MainActivity.hour * 3600000 + MainActivity.minute * 60000;
    private TextView mTextViewCountdown;
    private Button mButtonEStop;
    private CountDownTimer mCountDownTimer;
    private boolean running;
    private long timeLeftMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phocus_main);

        mTextViewCountdown = findViewById(R.id.text_view_countdown);
        mButtonEStop = findViewById(R.id.button_stop);

        mButtonEStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if (running) {
                    pauseTimer();
                }
            }
        });
    }

    private void startTimer() {
        mCountDownTimer = new CountDownTimer(timeLeftMS, 1000) {
            @Override
            public void onTick(long msLeft) {
                timeLeftMS = msLeft;
                updateCountdownText();
            }

            @Override
            public void onFinish() {
                running = false;
            }
        }.start();

        running = true;

    }
    private void pauseTimer() {
        mCountDownTimer.cancel();
        running = false;

    }

    private void updateCountdownText () {
        int tempTimeLeft = (int) timeLeftMS;
        int hours = tempTimeLeft / 3600000;
        tempTimeLeft-= 3600000*hours;
        int minutes = tempTimeLeft/ 60000;
        tempTimeLeft -= 60000*minutes;
        int seconds = tempTimeLeft/1000;

        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        mTextViewCountdown.setText(timeLeftFormatted);
    }
}