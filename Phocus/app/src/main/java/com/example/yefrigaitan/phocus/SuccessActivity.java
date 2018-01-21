package com.example.yefrigaitan.phocus;



import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by jackshi on 1/20/18.
 */

public class SuccessActivity extends AppCompatActivity {
    private static TextView streakText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);
    }

}
