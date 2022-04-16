package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_ATTEMPT = 3;
    public static final int MAX_PLAYERS = 3;
    private static Scanner scanner;
    private Player[] players;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void guess() {
        int guessNum = 0;
        boolean isFinish = true;
        scanner = new Scanner(System.in);

        resetGame(players);
        guessNum = (int) (Math.random() * 100 + 1);
        System.out.println("у каждого игрока по " + MAX_ATTEMPT + " попыток ");
        while (isFinish) {

            for(Player currentPlayer: players) {
                System.out.print("Ходит игрок " + currentPlayer.getName() + "; ");
                currentPlayer.incAttempt();
                if (currentPlayer.isOverAttempt()) {
                    System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                } else {
                    System.out.println("У " + currentPlayer.getName() + " попытка " + currentPlayer.getAttempt());
                    currentPlayer.addNums(inputNum());
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

    public void resetGame(Player[] players) {
        for(Player player : players) {
            Arrays.fill(player.getNums(), 0, player.getAttempt(), 0);
            player.setAttempt(0);
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
        boolean result = false;
        String str;
         if (num == player.getNums()[player.getAttempt() - 1]) {
             result =true;
             str = "Игрок " + player.getName() + " угадал число " + num + " с " + player.getAttempt() + " попытки";
         } else if (num < player.getNums()[player.getAttempt() - 1]) {
             result =false;
             str = "Вы ввели число больше, чем загадал компьютер";
         }  else {
             result =false;
             str = "Вы ввели число меньше, чем загадал компьютер";
         }
        System.out.println(str);
        return result;
    }
}