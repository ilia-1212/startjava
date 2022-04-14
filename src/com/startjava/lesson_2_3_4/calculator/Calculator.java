package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static String mathSign;
    private static int num1;
    private static int num2;
    private static float result;

    public static void setNum1(int par) {
        num1 = par;
    }

    public static void setSign(String par) {
        mathSign = par;
    }

    public static void setNum2(int par) {
        num2 = par;
    }

    public static float calculate() {
        calculateExpression();
        return result;
    }

    private static void calculateExpression() {
        result = switch (mathSign) {
            case "+" ->  num1 + num2;
            case "-" ->  num1 - num2;
            case "*" ->  num1 * num2;
            case "/" ->  (float) num1 / num2;
            case "^" ->  (float) Math.pow(num1, num2);
            case "%" ->  num1 % num2;
            default -> 0;
        };
    }
}