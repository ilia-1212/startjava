package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private static Scanner scanner;
    private Player player1;
    private Player player2;
    private Player[] players;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public GuessNumber(Player[] players) {
        this.players = Arrays.copyOf(players,players.length);
    }

    public void guess() {
        int guessNum = 0;
        //int queuePlayer = 0;
        boolean isFinish = true;
        scanner = new Scanner(System.in);

        guessNum = (int) (Math.random() * 100 + 1);
        //queuePlayer = (int) (Math.random() * 3);
        System.out.println("у каждого игрока по " + Player.MAX_ATTEMPT + " попыток ");
        while (isFinish) {

            for(Player currentPlayer: players) {
                System.out.print("Ходит игрок: " + currentPlayer.getName() + "; ");
                currentPlayer.incAttempt();
                if (currentPlayer.isOverAttempt()) {
                    System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                } else {
                    System.out.println("У " + currentPlayer.getName() + " попытка " + currentPlayer.getAttempt());
                    currentPlayer.setNum(inputNum());
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
            System.out.println("Игрок " + currentPlayer.getName() + " выбирал числа: " + currentPlayer.toString());
        }
    }

    public void resetGame(Player player) {
        Arrays.fill(player.getNums(), 0, player.getAttempt(), 0);
        player.setAttempt(0);
    }

    public void resetGame(Player[] players) {
        for(Player player : players) {
            Arrays.fill(player.getNums(), 0, player.getAttempt(), 0);
            player.setAttempt(0);
        }
    }

    private int inputNum() {
        int num;
            System.out.println("Введите число, оно должно быть целое положительное, (0, 100]");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено не число, повторите ввод");
                scanner.next();
            }
            num = scanner.nextInt();
        return num;
    }

    private boolean compareNum(int num, Player player) {
        boolean result = false;
        result = (num == player.getNum()) ? true : (num < player.getNum()) ? false : false;
        String str;
        str = (num == player.getNum()) ? "Игрок " + player.getName() + " угадал число " + num + " с " + player.getAttempt() + " попытки" : (num < player.getNum()) ? player.getName() + " Вы ввели число больше, чем загадал компьютер" : player.getName() + " Вы ввели число меньше, чем загадал компьютер";
        System.out.println(str);
        return result;
    }
}