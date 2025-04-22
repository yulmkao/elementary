package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float expected1 = 1.4f;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        float in2 = 300;
        float expected2 = 3.3333333f;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 1.4 euros. Test result: " + passed1);
        System.out.println("300 rubles are 3.3333333 dollars. Test result: " + passed2);
    }
}