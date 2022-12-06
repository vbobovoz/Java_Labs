package org.example;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.ROUND_DOWN;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BigSeriesTest {
    @Test
    public void big_test1() throws Exception {
        BigSeries obj = new BigSeries(0.05, 15);
        BigDecimal bd = BigDecimal.valueOf(Math.log(1 - 0.05));
        assertEquals(bd.setScale(10, ROUND_DOWN), obj.BigSolution().setScale(10, ROUND_DOWN));
    }

    @Test
    public void big_test2() throws Exception {
        BigSeries obj = new BigSeries(0.99, 50);
        BigDecimal bd = BigDecimal.valueOf(Math.log(1 - 0.99));
        assertEquals(bd.setScale(10, ROUND_DOWN), obj.BigSolution().setScale(10, ROUND_DOWN));
    }

    @Test
    public void big_test3() throws Exception {
        BigSeries obj = new BigSeries(4, 2);
        Exception ex = (Exception) assertThrows(Exception.class, () -> { obj.BigSolution(); });

        String expectedMes = "Error! Enter X from range [-1, 1]";
        String actualMes = ex.getMessage();
        assertEquals(expectedMes, actualMes);
    }

    @Test
    public void big_test4() throws Exception {
        BigSeries obj = new BigSeries(-2, 100);
        Exception ex = (Exception) assertThrows(Exception.class, () -> { obj.BigSolution(); });

        String expectedMes = "Error! Enter X from range [-1, 1]";
        String actualMes = ex.getMessage();
        assertEquals(expectedMes, actualMes);
    }
}