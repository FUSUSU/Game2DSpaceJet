package com.example.teo.game2dspacejet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by teo on 1/24/2017.
 */

public class Player {
    //Bitmap to get character from image
    //Bitmap lấy được nhân vật từ ảnh.
    private Bitmap bitmap;

    //coordinates
    //Tọa độ
    private int x;
    private int y;

    //motion speed of the character
    //Tốc độ chuyển động của nhân vật
    private int speed = 0;

    //constructor
    //Cấu trúc
    public Player(Context context){
        x = 75;
        y = 50;
        speed = 1;

        //Getting bitmap from drawable resource
        //lấy bitmap từ người drawable
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.player);
    }

    //Method to update coordinate of character
    //Phương thức cập nhật tọa độ của nhân vật
    public void update(){
        //updating x coordinate
        //cập nhật tọa độ x
        x++;
    }

    /*
    * These are getters you can generate it automatically
    * right click on editor -> generate -> getters
     */

    public Bitmap getBitmap(){
        return bitmap;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSpeed(){
        return speed;
    }
}
