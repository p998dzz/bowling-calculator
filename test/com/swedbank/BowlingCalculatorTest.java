package com.swedbank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingCalculatorTest {
    BowlingCalculator calc;

    @Before
    public void setup()
    {
        calc = new BowlingCalculator();
    }

    @Test
    public void createCalculator() {
        assertNotNull(calc);
    }

    @Test
    public void emptyGameShouldReturnZeroResult() {
        assertEquals("0", calc.getResult());
    }

    

}