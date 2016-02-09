package com.swedbank;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by p998dzz on 2016.02.09.
 */
public class FrameTest {
    Frame a;
    @Before
    public void setup(){
        a = new Frame();
    }

    @Test
    public void rollBallInFrame(){
        Frame a = new Frame();
        a.roll(8);
    }

    @Test
    public void frameHasNoBalls(){
        Frame a = new Frame();
        assertFalse(a.hasBalls());
    }

    @Test
    public void hitStrike(){
        a.roll(10);
    }

    @Test
    public void getResultXafterHittingStrike(){
        a.roll(10);
        assertEquals("X",a.getResult());
    }
}