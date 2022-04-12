package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-Угадай число-");
        System.out.print("Введите имя игрока 1: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя игрока 2: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer = "";
        while (!playerAnswer.equals("no")) {
            game.guess();
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            while (isContinued(playerAnswer = scanner.nextLine())) {
                    System.out.println("Допустимы только значения: (yes/no)");
            }
        }
        scanner.close();
    }

    private static boolean isContinued(String answer) {
        return (!answer.equals("yes") && !answer.equals("no"));
    }
}