package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3To4() {
        int[] input = {11, 10, 23, 17, 55, 32, 54, 88};
        int source = 3;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 10, 23, 55, 17, 32, 54, 88};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to2() {
        int[] input = {5, 10, 15, 20};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 15, 10, 20};
        assertThat(result).containsExactly(expected);
    }
}