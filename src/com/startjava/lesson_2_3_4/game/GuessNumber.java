package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_ATTEMPT = 10;
    private static Scanner scanner;
    private int guessNum = 0;
    private Player[] players;

    public GuessNumber(Player[] players) {
        scanner = new Scanner(System.in);
        this.players = players;
    }

    public void guess() {
        boolean isFinish = true;

        resetGame(players);
        guessNum = (int) (Math.random() * 100 + 1);
        System.out.println("у каждого игрока по " + MAX_ATTEMPT + " попыток " + guessNum);
        while (isFinish) {
            for(Player currentPlayer: players) {
                System.out.print("Ходит игрок " + currentPlayer.getName() + "; ");
                currentPlayer.incAttempt();
                if (currentPlayer.isOverAttempt()) {
                    System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                } else {
                    System.out.println("У " + currentPlayer.getName() + " попытка " + currentPlayer.getAttempt());
                    currentPlayer.addNum(inputNum());
                    if (compareNum(guessNum, currentPlayer)) {
                        isFinish = false;
                        break;
                    }
                }
                if (currentPlayer.isOverAttempt()) {
                    currentPlayer.setAttempt(currentPlayer.getAttempt() - 1);
                    isFinish = false;
                    continue;
                }
            }
        }
        for(Player currentPlayer: players) {
            System.out.println("Игрок " + currentPlayer.getName() + " выбирал числа: " + Arrays.toString(currentPlayer.getNums()));
        }

    }

    private void resetGame(Player[] players) {
        for(Player player: players) {
            player.resetPlayer();
        }
    }

    private int inputNum() {
        int num;
        System.out.print("Введите число, оно должно быть целое положительное, (0, 100]: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не число, повторите ввод");
            scanner.next();
        }
        num = scanner.nextInt();
        return num;
    }

    private boolean compareNum(int num, Player player) {
        String textCompare;
         if (num == player.getCurrentNum()) {
             textCompare = "Игрок " + player.getName() + " угадал число " + num + " с " + player.getAttempt() + " попытки";
             System.out.println(textCompare);
             player.incWinCount();
             return true;
         }
        textCompare = (num < player.getCurrentNum()) ? "Вы ввели число больше" : "Вы ввели число меньше";
        textCompare += ", чем загадал компьютер";
        System.out.println(textCompare);
        return false;
    }
}