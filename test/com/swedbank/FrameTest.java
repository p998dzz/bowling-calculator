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
    public void resultAfterOneHitMatchWhatYouRolled(){
        Frame a = new Frame();
        a.roll(8);
        assertEquals("8", a.getResult());
    }

    @Test
    public void frameHasNoBallsWhenRollSumIsLessThan10(){
        Frame a = new Frame();
        a.roll(5);
        a.roll(3);
        assertFalse(a.hasBalls());
    }

    @Test
    public void resultAfterHittingStrikeIsX(){
        a = new Frame();
        a.roll(10);
        assertEquals("X",a.getResult());
    }

    @Test
    public void ballCountAfterStrikeAsFirstIs2()
    {
        a.roll(10);
        assertEquals(2, a.getBallCount());
    }

    @Test
    public void hitSpare(){
        a.roll(5);
        assertEquals("5", a.getResult());
        a.roll(5);
        assertEquals("//", a.getResult());
    }

    @Test
    public void hitTwoExtraAfterStrike(){
        a = new Frame();
        a.roll(10);
        assertEquals("X", a.getResult());
        a.roll(8);
        assertEquals("8", a.getResult());
        a.roll(1);
        assertEquals("1", a.getResult());
    }

    @Test
    public void cannotHitThreeExtraAfterStrike(){
        a = new Frame();
        a.roll(10);
        assertEquals("X", a.getResult());
        a.roll(8);
        assertEquals("8", a.getResult());
        a.roll(1);
        assertEquals("1", a.getResult());
        a.roll(1);
        assertNotEquals("1", a.getResult());
    }

}