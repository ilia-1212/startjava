package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private static Scanner scanner;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guess() {
        int guessNum = 0;
        scanner = new Scanner(System.in);

        guessNum = (int) (Math.random() * 100 + 1);
        System.out.println("у каждого игрока по " + Player.MAX_ATTEMPT + " попыток ");
        while (true) {
            System.out.print("Ходит игрок номер 1 :" + player1.getName() + "; ");
            player1.incAttempt();
            if (player1.isOverAttempt()) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            } else {
                System.out.println("У " + player1.getName() + " попытка " + player1.getAttempt());
                player1.setNum(inputNum());
                if (compareNum(guessNum, player1)) break;
            }

            System.out.print("Ходит игрок номер 2 :" + player2.getName() + "; ");
            player2.incAttempt();
            if (player2.isOverAttempt()) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            } else {
                System.out.println("У " + player2.getName() + " попытка " + player2.getAttempt());
                player2.setNum(inputNum());
                if (compareNum(guessNum, player2)) break;
            }

            if (player1.isOverAttempt() || player2.isOverAttempt()) {
                player1.setAttempt(player1.getAttempt() - 1);
                player2.setAttempt(player2.getAttempt() - 1);
                break;
            }
        }
        System.out.println("Игрок " + player1.getName() + " выбирал числа: " + player1.toString());
        System.out.println("Игрок " + player2.getName() + " выбирал числа: " + player2.toString());
    }

    public void resetGame(Player player) {
        Arrays.fill(player.nums, 0, player.getAttempt(), 0);
        player.setAttempt(0);
    }

    private int inputNum() {
        int num;
        do {
            System.out.println("Введите число, оно должно быть целое положительное, (0, 100]");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено не число, повторите ввод");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0 || num > 100);
        return num;
    }

    private boolean compareNum(int num, Player player) {
        if (num == player.getNum()) {
            System.out.println("Игрок " + player.getName() + " угадал число " + num + " с " + player.getAttempt() + " попытки");
            return true;
        } else if (num < player.getNum()) {
            System.out.println(player.getName() + " Вы ввели число больше, чем загадал компьютер");
            return false;
        } else {
            System.out.println(player.getName() + " Вы ввели число меньше, чем загадал компьютер");
            return false;
        }
    }
}