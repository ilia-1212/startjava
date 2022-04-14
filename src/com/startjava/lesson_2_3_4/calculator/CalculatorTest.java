package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String playerAnswer = "";

        while (!playerAnswer.equals("no")) {
            System.out.print("Введите математическое выражение (используя пробелы): ");
            String[] exps= inputExpression();

            Calculator.setNum1(Integer.parseInt(exps[0]));
            Calculator.setSign(exps[1]);
            Calculator.setNum2(Integer.parseInt(exps[2]));

            System.out.printf("результат = " + "%.2f" + "\n", Calculator.calculate());
            System.out.println("Хотите продолжить вычисления (yes/no)?");
            while (!(playerAnswer = scanner.nextLine()).equals("yes") && !playerAnswer.equals("no")) {
                    System.out.println("Допустимы только значения: (yes/no)");
            }
        }
        scanner.close();
    }

    private  static String[] inputExpression() {
        String[] lines;
        do {
            System.out.println("число должно быть целое и положительное, диапазон (0, 100], а знак операции (+-*/^%)");
            lines = scanner.nextLine().split(" ");
        } while (isNonCheckedNum(lines[0]) || isNonCheckedOperation(lines[1]) || isNonCheckedNum(lines[2]));
        return lines;
    }

    private static boolean isNonCheckedNum(String str) {
        boolean isNonChecked = false;
        if (str == null || str.isEmpty())   isNonChecked = true;
        for(int i = 0; i < str.length(); i++) {
            if  (!Character.isDigit(str.charAt(i)))  isNonChecked = true;
        }

        if (isNonChecked) {
            System.out.println("Ошибка в числе [" + str + "]");
        }
        else {
            isNonChecked = !(Integer.parseInt(str) > 0 && Integer.parseInt(str) <= 100);
        }
        return isNonChecked;
    }

    private static boolean isNonCheckedOperation(String str) {
        boolean isNonChecked =  !(str.equals("+") ||
                str.equals("-") ||
                str.equals("*") ||
                str.equals("/") ||
                str.equals("^") ||
                str.equals("%"));
        if (isNonChecked) System.out.println("Ошибка в знаке операции [" + str + "]");
        return isNonChecked;
    }
}