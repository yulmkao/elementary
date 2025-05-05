package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11To45Then5() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        double expected = 5;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1915To119Then10() {
        Point a = new Point(19, 15);
        Point b = new Point(11, 9);
        double expected = 10;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when74To31Then5() {
        Point a = new Point(7, 4);
        Point b = new Point(3, 1);
        double expected = 5;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when55To55Then0() {
        Point a = new Point(5, 5);
        Point b = new Point(5, 5);
        double expected = 0;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}