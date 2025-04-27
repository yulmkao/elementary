package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirstNumberMin() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 10, 8, 9};
        int result = Min.findMin(array);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
