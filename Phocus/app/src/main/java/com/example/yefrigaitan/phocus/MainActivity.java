package com.example.yefrigaitan.phocus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int minute,hour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phocus_main);

        // hour seekbar
        SeekBar seekBarHour = (SeekBar) findViewById(R.id.seekBarHour);
        seekBarHour.setMax(8); // 8 is maximum value for the Seek Bar
        seekBarHour.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            hour = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                hour = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Hours :" + hour,
                        Toast.LENGTH_SHORT).show();
            }
        });

        //minute seekbar
        SeekBar seekBarMinute = (SeekBar) findViewById(R.id.seekBarMinute);
        seekBarHour.setMax(60); // 60 is maximum value for the Seek Bar
        seekBarHour.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            minute = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                minute = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Minutes :" + minute,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }




    public void goToHome (View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }



}

