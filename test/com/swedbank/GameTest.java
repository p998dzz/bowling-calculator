package com.swedbank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by p998dzz on 2016.02.09.
 */
public class GameTest {

    @Test
    public void gameHasTenFrames(){
        Game game = new Game();
        assertEquals(10, game.getFrames());
    }

    @Test
    public void gameAddExtraBalls(){
        Game game = new Game();
        game.addExtraBall();
    }

    @Test
    public void gameAddTwoExtraBalls(){
        Game game = new Game();
        game.addExtraBall();
        game.addExtraBall();
        assertEquals(2, game.getExtraBalls());
    }

    @Test
    public void gameCannotHaveThreeBalls(){
        Game game = new Game();
        game.addExtraBall();
        game.addExtraBall();
        game.addExtraBall();
        assertEquals(2, game.getExtraBalls());
    }

}