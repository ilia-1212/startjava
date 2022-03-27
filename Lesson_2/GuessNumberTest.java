import java.util.Scanner;


public class GuessNumberTest {
    private static Scanner scanner;

    public static void main(String[] args) {
        Player player1;
        Player player2;
        GuessNumber game;
        scanner = new Scanner(System.in);
        String playerAnswer = "";

        System.out.println("-Угадай число-");
        System.out.print("Введите имя игрока 1: ");
        player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя игрока 2: ");
        player2 = new Player(scanner.nextLine());

        game = new GuessNumber(player1, player2);
        while (!playerAnswer.equals("no")) {
            game.guess();
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            while (!(playerAnswer = scanner.nextLine()).equals("yes") && !playerAnswer.equals("no")) {
                    System.out.println("Допустимы только значения: (yes/no)");
            }
        }
        scanner.close();
    }
}