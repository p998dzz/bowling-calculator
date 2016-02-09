package com.swedbank;

/**
 * Created by p998dzz on 2016.02.09.
 */
public class Game {

    int extraBalls;

    public Game(){
        extraBalls = 0;
    }

    public int getFrames() {
        return 10;
    }

    public void addExtraBall() {
        if(extraBalls<2)
            extraBalls++;
    }

    public int getExtraBalls() {
        return extraBalls;
    }
}
