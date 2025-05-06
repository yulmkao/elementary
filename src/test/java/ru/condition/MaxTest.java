package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To6Then10() {
        int left = 10;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax122To666Then666() {
        int left = 122;
        int right = 666;
        int result = Max.max(left, right);
        int expected = 666;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To25To20Then5() {
        int left = 1;
        int middle = 25;
        int right = 20;
        int result = Max.max(left, middle, right);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax99To239To519Then519() {
        int left = 99;
        int middle = 239;
        int right = 519;
        int result = Max.max(left, middle, right);
        int expected = 519;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax44To247To22To35Then247() {
        int left = 44;
        int middle = 246;
        int middle2 = 22;
        int right = 35;
        int result = Max.max(left, middle, middle2, right);
        int expected = 246;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To42To505To1Then505() {
        int left = 6;
        int middle = 42;
        int middle2 = 505;
        int right = 1;
        int result = Max.max(left, middle, middle2, right);
        int expected = 505;
        assertThat(result).isEqualTo(expected);
    }
}