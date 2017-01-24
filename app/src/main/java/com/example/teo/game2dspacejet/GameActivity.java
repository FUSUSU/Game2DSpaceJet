package com.example.teo.game2dspacejet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by teo on 1/24/2017.
 */

public class GameActivity extends AppCompatActivity {

    //declaring gameView
    //tuyên bố (khai báo) gameView
    private GameView gameView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //Initializing game view object
        gameView = new GameView(this);

        //adding it to contentView;
        setContentView(gameView);
    }

    //pausing the game when activity is paused.
    //Tạm dừng trò chơi khi activity dừng.
    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    //running the game when activity is resumed
    //Chạy game khi activity tiếp tục
    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }
}
