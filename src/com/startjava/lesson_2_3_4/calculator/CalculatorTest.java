package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner;
    private static String playerAnswer = "";

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        while (!playerAnswer.equals("no")) {
            System.out.println("Введите математическое выражение (используя пробелы): ");
            inputExpression();
            System.out.printf("результат = " + "%.2f" + "\n", Calculator.calculate());
            System.out.println("Хотите продолжить вычисления (yes/no)?");
            while (checkAnswer()) {
                    System.out.println("Допустимы только значения: (yes/no)");
            }
        }
        scanner.close();
    }

    private static void inputExpression() {
        do {
            System.out.println("число должно быть целое и положительное, диапазон (0, 100], а знак операции (+-*/^%)");
            Calculator.addMathExpression(scanner.nextLine());
        } while (Calculator.checkExpression());
    }

    private static boolean checkAnswer() {
        return !(playerAnswer = scanner.nextLine()).equals("yes") && !playerAnswer.equals("no");
    }
}