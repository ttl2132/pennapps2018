package com.example.yefrigaitan.phocus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phocus_setup);
    }

    public void startMain (View v){
        Intent intent = new Intent (this, SuccessActivity.class);
        startActivity(intent);
    }
}

