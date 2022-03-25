import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    private static int numPlayerChoice = 1;
    private static int cnt = 0;
    private static Player player1;
    private static Player player2;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessnum = new GuessNumber();

        System.out.println("-Угадай число-");
        System.out.print("Введите имя игрока 1: ");
        player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя игрока 2: ");
        player2 = new Player(scanner.nextLine());

        while (!guessnum.getIsFinished()) {
            System.out.print("ходит игрок номер " + numPlayerChoice + ", выбирает число: ");
            if (numPlayerChoice == 1) {
                player1.setNum(inputNum());
                numPlayerChoice = 2;
            } else {
                player2.setNum(inputNum());
                numPlayerChoice = 1;
            }
            guessnum = new GuessNumber(player1, player2);
            guessnum.guess();
        }
        scanner.close();
    }

    private static int inputNum() {
        int num;
        do {
            System.out.println("должно быть целое положительное, (0, 100]");
            while (!scanner.hasNextInt()) {
                
                System.out.println("Введено не число, повторите ввод");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0 || num > 100);
        return num;
    }
}