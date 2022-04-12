package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String playerAnswer = "";

        while (!playerAnswer.equals("no")) {
            Calculator cl = new Calculator();

            System.out.print("Введите математическое выражение(используя пробелы): ");
            String[] exps= inputExpression();
            cl.setNum1(Integer.parseInt(exps[0]));
            cl.setSign(exps[1]);
            cl.setNum2(Integer.parseInt(exps[2]));

            System.out.printf("результат = " + "%.2f" + "\n", cl.calculate());
            System.out.println("Хотите продолжить вычисления?");
            while (!(playerAnswer = scanner.nextLine()).equals("yes") && !playerAnswer.equals("no")) {
                    System.out.println("Допустимы только значения: (yes/no)");
            }
        }
        scanner.close();
    }

    private  static String[] inputExpression() {
        return scanner.nextLine().split(" ");
    }

    private static int inputNum() {
        int num;
        do {
            System.out.println("должно быть целое и положительное, (0, 100]");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено не число, повторите ввод");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0 || num > 100);
        return num;
    }

    private static String inputOperation() {
        String sign;
        do {
            System.out.println("допустимо значение из вариантов: (+-*/^%)");
            while (!scanner.hasNextLine()) {
                System.out.println("Введен не символ операции, повторите ввод");
                scanner.next();
            }
            sign = scanner.nextLine();
        } while (!sign.equals("+") &&
                    !sign.equals("-") &&
                    !sign.equals("*") &&
                    !sign.equals("/") &&
                    !sign.equals("^") &&
                    !sign.equals("%"));
        return sign;
    }
}