package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player[] players = new Player[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("-Угадай число-");

        System.out.print("Введите имя игрока 1: ");
        Player player1 = new Player(scanner.nextLine());
        players[0] = player1;

        System.out.print("Введите имя игрока 2: ");
        Player player2 = new Player(scanner.nextLine());
        players[1] = player2;

        System.out.print("Введите имя игрока 3: ");
        Player player3 = new Player(scanner.nextLine());
        players[2] = player3;

        GuessNumber game = new GuessNumber(players);
        String playerAnswer = "";
        while (!playerAnswer.equals("no")) {
            game.resetGame(players);
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