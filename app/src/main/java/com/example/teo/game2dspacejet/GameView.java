package com.example.teo.game2dspacejet;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceView;

/**
 * Created by teo on 1/24/2017.
 */

public class GameView extends SurfaceView implements Runnable{

    //boolean variable to track if the game is playing or not
    volatile boolean playing;

    //the game thread
    private Thread gameThread = null;

    //Class constructor
    public GameView(Context context){
        super(context);
    }

    @Override
    public void run() {
        while (playing){
            //to update the frame
            update();

            //to draw the frame
            draw();

            //to control
            control();
        }
    }


    private void update() {

    }

    private void draw() {
    }

    private void control() {
        try {
            gameThread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pause(){
        //when the game is paused
        //Khi game tạm dừng
        //setting the variable to false
        //Thiết lập giá trị sai
        playing = false;
        try {
            //stopping the thread
            gameThread.join();
        } catch (InterruptedException e) {
        }
    }

    public void resume(){
        //When the game is resumed
        //Starting the thread again
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

}
