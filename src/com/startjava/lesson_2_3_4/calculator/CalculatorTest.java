package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static String playerAnswer = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!playerAnswer.equals("no")) {
            System.out.println("Введите математическое выражение (используя пробелы): ");
            float result = 0f;
            do {
                System.out.println("число должно быть целое и положительное, диапазон (0, 100], а знак операции (+-*/^%)");
                result = Calculator.calculate(scanner.nextLine());
            } while (result == -1f);
            System.out.printf("результат = " + "%.2f" + "\n", result);
            System.out.println("Хотите продолжить вычисления (yes/no)?");
            while (checkAnswer(scanner.nextLine())) {
                    System.out.println("Допустимы только значения: (yes/no)");
            }
        }
        scanner.close();
    }

    private static boolean checkAnswer(String Answer) {
        return !(playerAnswer = Answer).equals("yes") && !playerAnswer.equals("no");
    }
}