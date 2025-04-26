package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] number = new int[bound];
        for (int index = 0; index < bound; index++) {
            number[index] = index * index;
        }
        return number;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int numbers : array) {
            System.out.println(numbers);
        }
    }
}
