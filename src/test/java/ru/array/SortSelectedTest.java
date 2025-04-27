package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort5() {
        int[] data = new int[] {1, 55, 23, 190, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 23, 55, 190};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {101, 99, 100};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {99, 100, 101};
        assertThat(result).containsExactly(expected);
    }

}