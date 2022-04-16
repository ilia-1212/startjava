package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static String mathSign;
    private static int num1;
    private static int num2;
    private static float result;

    public static float calculate(String[] lines) {
        num1 = Integer.parseInt(lines[0]);
        mathSign = lines[1];
        num2 = Integer.parseInt(lines[2]);

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