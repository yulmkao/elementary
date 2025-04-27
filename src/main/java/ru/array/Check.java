package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean reference = data[0];
        for (int index = 1; index < data.length; index++) {
            if (data[index] != reference) {
                return false;
            }
        }
        return true;
    }
}
