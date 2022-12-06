package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JustSeriesTest {
    @Test
    public void just_test1() throws Exception {
        JustSeries obj = new JustSeries(0.05, 15);
        assertEquals(Math.log(1 - 0.05), obj.Solution(),  1e-10);
    }

    @Test
    public void just_test2() throws Exception {
        JustSeries obj = new JustSeries(0.99, 50);
        assertEquals(Math.log(1 - 0.99), obj.Solution(),  1e-10);
    }

    @Test
    public void just_test3() throws Exception {
        JustSeries obj = new JustSeries(4, 2);
        Exception ex = (Exception) assertThrows(Exception.class, () -> { obj.Solution(); });

        String expectedMes = "Error! Enter X from range [-1, 1]";
        String actualMes = ex.getMessage();

        assertEquals(expectedMes, actualMes);
    }

    @Test
    public void just_test4() throws Exception {
        JustSeries obj = new JustSeries(-2, 100);
        Exception ex = (Exception) assertThrows(Exception.class, () -> { obj.Solution(); });

        String expectedMes = "Error! Enter X from range [-1, 1]";
        String actualMes = ex.getMessage();

        assertEquals(expectedMes, actualMes);
    }
}