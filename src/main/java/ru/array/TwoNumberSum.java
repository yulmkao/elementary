package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                return new int[]{i, j};
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
