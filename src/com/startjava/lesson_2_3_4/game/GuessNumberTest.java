package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static final int MAX_PLAYERS = 3;

    private static Scanner scanner = new Scanner(System.in);
    private static Player[] players = new Player[MAX_PLAYERS];

    public static void main(String[] args) {
        System.out.println("-Угадай число-");
        createPlayers();
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

    private static void createPlayers() {
        for(int i = 0; i < MAX_PLAYERS; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
    }

    private static boolean isContinued(String answer) {
        return (!answer.equals("yes") && !answer.equals("no"));
    }
}