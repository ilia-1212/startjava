package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player[] players = new Player[GuessNumber.MAX_PLAYERS];
        Scanner scanner = new Scanner(System.in);
        System.out.println("-Угадай число-");

        for(int i = 0; i < GuessNumber.MAX_PLAYERS; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
        GuessNumber game = new GuessNumber(players);
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