package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static final int MAX_PLAYERS = 3;
    public static final int MAX_GAMES = 3;

    private static Scanner scanner = new Scanner(System.in);
    private static Player[] players = new Player[MAX_PLAYERS];

    public static void main(String[] args) {
        System.out.println("-Угадай число-");
        createPlayers();
        GuessNumber game = new GuessNumber(players);
        String playerAnswer = "";
        int currentGame = 0;
        while (!playerAnswer.equals("no")) {
            System.out.println("Игра: " + (currentGame + 1));
            game.guess();
            currentGame++;
            if (checkGameOver(currentGame)) break;
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            while (isContinued(playerAnswer = scanner.nextLine())) {
                    System.out.println("Допустимы только значения: (yes/no)");
            }
        }
        if (checkGameOver(currentGame)) showScore();
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

    public static boolean checkGameOver(int gameNumber) {
        return (gameNumber < MAX_GAMES) ? false : true;
    }

    private static void showScore() {
        int playerScore = 0;
        int idxPlayer = 0;
        for(int i = 0; i < players.length; i++) {
            System.out.println("Игрок " + players[i].getName() + " счет: " + players[i].getWinCount());
            if (playerScore < players[i].getWinCount()) {
                playerScore = players[i].getWinCount();
                idxPlayer = i;
            }
        }
        System.out.println("Победитель по количеству " + MAX_GAMES +
                " игр признан игрок номер " + (idxPlayer + 1)+ ": " +
                players[idxPlayer].getName() + " c " + playerScore + " побед");
    }

}