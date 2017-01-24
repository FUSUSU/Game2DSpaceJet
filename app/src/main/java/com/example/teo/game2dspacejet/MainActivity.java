package com.example.teo.game2dspacejet;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //image button
    private ImageButton buttonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting the orientation to landscape
        //Cài đặt định hướng đến cảnh quan (nằm ngang)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //getting the button
        //Ánh xạ button PlayNow
        buttonPlay = (ImageButton) findViewById(R.id.buttonPlay);
    }

    @Override
    public void onClick(View v) {
        //starting game activity
        //Chuyển đến activity Game
        startActivity(new Intent(this, GameActivity.class));
    }
}
