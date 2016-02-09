package com.swedbank;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BowlingCalculatorTest {
    BowlingCalculator calc;

    @Before
    public void setup() {
        calc = new BowlingCalculator();
    }

    @Test
    public void createCalculator() {
        assertNotNull(calc);
    }

    @Test
    public void createFrame() {
        Frame a = new Frame();
    }

    @Test
    public void gameExists() {
        Game a = new Game();
    }

    @Test
    public void createTenFrames(){
        List<Frame> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(new Frame());
    }
}