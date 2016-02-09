package com.swedbank;

/**
 * Created by p998dzz on 2016.02.09.
 */
public class Frame {

    int balls;

    public Frame() {
        balls = 2;
    }

    public void roll(int i) {
    }


    public boolean hasBalls() {
        if (balls > 0)
            return true;
        return false;
    }

    public String getResult() {
        return String.valueOf(10);
    }
}
