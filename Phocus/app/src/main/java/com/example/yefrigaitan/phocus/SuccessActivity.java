package com.example.yefrigaitan.phocus;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


/**
 * Created by jackshi on 1/20/18.
 */

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);
    }

    public void goToHome (View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
