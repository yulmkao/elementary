package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11To45Then5() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 5;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1915To119Then10() {
        int x1 = 19;
        int y1 = 15;
        int x2 = 11;
        int y2 = 9;
        double expected = 10;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when74To31Then5() {
        int x1 = 7;
        int y1 = 4;
        int x2 = 3;
        int y2 = 1;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when55To55Then0() {
        int x1 = 5;
        int y1 = 5;
        int x2 = 5;
        int y2 = 5;
        double expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}