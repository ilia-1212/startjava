import java.util.Random;
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

        guessNum = (int) (Math.random() *100 + 1);
        while (!(guessNum == player1.getNum() || guessNum == player2.getNum())) {
                System.out.println("ходит игрок номер 1 (" + player1.getName() + "):");
                player1.setNum(inputNum());
                compareNum(guessNum, player1.getNum());

                System.out.println("ходит игрок номер 2 (" + player2.getName() + "):");
                player2.setNum(inputNum());
                compareNum(guessNum, player2.getNum());
        }
        System.out.println("Вы угадали!");
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

    private void compareNum(int num1, int num2) {
        if (num1 < num2) System.out.println("Вы ввели число больше, чем загадал компьютер");
        else if (num1 > num2) System.out.println("Вы ввели число меньше, чем загадал компьютер");
    }
}