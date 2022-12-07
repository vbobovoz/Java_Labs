package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegExFalseTest {
    @Test
    public void test_1() {
        assertFalse(RegEx.isTrue("0000456С001РВ3 Московский РУВД Брест"));
    }

    @Test
    public void test_2() {
        assertFalse(RegEx.isTrue("7123456E001РВ9 Октябрьский РУВД"));
    }

    @Test
    public void test_3() {
        assertFalse(RegEx.isTrue("1123456H001РВ7 Советский Гомель"));
    }

    @Test
    public void test_4() {
        assertFalse(RegEx.isTrue("2020456K001РС3 Московский РУВД Гродно"));
    }

    @Test
    public void test_5() {
        assertFalse(RegEx.isTrue("1100056А001РВ5 Московский РУВ Минск"));
    }

    @Test
    public void test_6() {
        assertFalse(RegEx.isTrue("7123456B001РВ3 РУВД"));
    }

    @Test
    public void test_7() {
        assertFalse(RegEx.isTrue("2123456M001РВ2 РУВД Могилев"));
    }

    @Test
    public void test_8() {
        assertFalse(RegEx.isTrue("7123456А001РВ4 Минск"));
    }

    @Test
    public void test_9() {
        assertFalse(RegEx.isTrue("57123456Н001РВ1 РУВД Гомель"));
    }

    @Test
    public void test_10() {
        assertFalse(RegEx.isTrue("7123456K001 ВА Московский"));
    }
}