package com.startjava.lesson_2_3_4.guessNumber;

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
        while (true) {
            System.out.println("Ходит игрок номер 1:");
            player1.setNum(inputNum());
            if (compareNum(guessNum, player1)) break;

            System.out.println("Ходит игрок номер 2:");
            player2.setNum(inputNum());
            if (compareNum(guessNum, player2)) break;
        }
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
            System.out.println(player.getName() + " Вы угадали!");
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