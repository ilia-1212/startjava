package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;

public class Calculator {
    private static String mathSign;
    private static int num1;
    private static int num2;
    private static float result;
    private static String[] mathExpressions;

    public static void addMathExpression(String mathExpression) {
        Calculator.mathExpressions = mathExpression.split(" ");
    }

    public static boolean checkExpression() {
        return checkValidNumber(mathExpressions[0]) || checkValidSign(mathExpressions[1]) || checkValidNumber(mathExpressions[2]);
    }

    private static boolean checkValidNumber(String number) {
        boolean isNonChecked = false;
        if (number == null || number.isEmpty()) isNonChecked = true;
        for(int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) isNonChecked = true;
        }

        if (isNonChecked) {
            System.out.println("Ошибка в числе [" + number + "]");
        } else {
            isNonChecked = !(Integer.parseInt(number) > 0 && Integer.parseInt(number) <= 100);
        }
        return isNonChecked;
    }

    private static boolean checkValidSign(String Sign) {
        boolean isNonChecked = !(Sign.equals("+") ||
                Sign.equals("-") ||
                Sign.equals("*") ||
                Sign.equals("/") ||
                Sign.equals("^") ||
                Sign.equals("%"));
        if (isNonChecked) System.out.println("Ошибка в знаке операции [" + Sign + "]");
        return isNonChecked;
    }

    public static float calculate() {

        num1 = Integer.parseInt(mathExpressions[0]);
        mathSign = mathExpressions[1];
        num2 = Integer.parseInt(mathExpressions[2]);
        result = switch (mathSign) {
            case "+" ->  num1 + num2;
            case "-" ->  num1 - num2;
            case "*" ->  num1 * num2;
            case "/" ->  (float) num1 / num2;
            case "^" ->  (float) Math.pow(num1, num2);
            case "%" ->  num1 % num2;
            default -> 0;
        };
        return result;
    }
}