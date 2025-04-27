package ru.array;

import ru.array.MinDiapason;
import ru.array.FindLoop;
import ru.array.SwitchArray;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minValue = MinDiapason.findMin(data, i, data.length - 1);
            int minIndex = FindLoop.indexInRange(data, minValue, i, data.length - 1);
            SwitchArray.swap(data, i, minIndex);
        }
        return data;
    }
}

