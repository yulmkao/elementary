package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(max(left, middle), right);
    }

    public static int max(int left, int middle, int middle2,  int right) {
        return max(max(left, middle, middle2), right);
    }

    public static void main(String[] args) {
        int left = 11;
        int right = 5;
        int result = Max.max(left, right);
        System.out.println("Maximum is: " + result);
    }
}
