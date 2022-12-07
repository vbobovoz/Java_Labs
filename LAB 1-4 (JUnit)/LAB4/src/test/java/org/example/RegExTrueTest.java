package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegExTrueTest {
    @Test
    public void test_1() {
        assertTrue(RegEx.isTrue("0000456C001PB3 Московский РУВД Брест"));
    }

    @Test
    public void test_2() {
        assertTrue(RegEx.isTrue("7123456E001PB9 Октябрьский РУВД Витебск"));
    }

    @Test
    public void test_3() {
        assertTrue(RegEx.isTrue("1123456H001PB7 Советский РУВД Гомель"));
    }

    @Test
    public void test_4() {
        assertTrue(RegEx.isTrue("2020456K001PB3 Московский РУВД Гродно"));
    }

    @Test
    public void test_5() {
        assertTrue(RegEx.isTrue("1100056A001PB5 Московский РУВД Минск"));
    }

    @Test
    public void test_6() {
        assertTrue(RegEx.isTrue("2123456M001PB2 Ленинский РУВД Могилев"));
    }

    @Test
    public void test_7() {
        assertTrue(RegEx.isTrue("7123456A001PB4 Фрунзенский РУВД Минск"));
    }

    @Test
    public void test_8() {
        assertTrue(RegEx.isTrue("7123456H001PB1 Ленинский РУВД Гомель"));
    }

    @Test
    public void test_9() {
        assertTrue(RegEx.isTrue("7123456K001 BA3 Московский РУВД Гродно"));
    }

    @Test
    public void test_10() {
        assertTrue(RegEx.isTrue("7123456A001 BI1 Московский РУВД Минск"));
    }
}