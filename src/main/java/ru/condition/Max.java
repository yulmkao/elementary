package ru.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int left = 11;
        int right = 5;
        int result = Max.max(left, right);
        System.out.println("Maximum is: " + result);
    }
}
