import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while (true) {
            Calculator cl = new Calculator();

            System.out.print("Введите первое число, ");
            cl.setNum1(inputNum());

            System.out.print("Введите знак операции, ");

            cl.setSign(inputOperation());

            System.out.print("Введите второе число, ");
            cl.setNum2(inputNum());

            cl.calculate();
            System.out.printf("результат = " + "%.2f" + "\n", cl.getResult());

            String playerAnswer;
            System.out.println("Хотите продолжить вычисления?");
            while (!(playerAnswer = scanner.nextLine()).equals("yes") && !playerAnswer.equals("no")) {
                    System.out.println("Допустимы только значения: (yes/no)");
            }
            if (playerAnswer.equals("no")) break;
        }
        scanner.close();
    }

    private static int inputNum() {
        int numOperation;
        do {
            System.out.println("должно быть целое и положительное, (0, 100]");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено не число, повторите ввод");
                scanner.next();
            }
            numOperation = scanner.nextInt();
        } while (numOperation < 0 || numOperation > 100);
        return numOperation;
    }

    private static String inputOperation() {
        String signOperation;
        do {
            System.out.println("допустимо значение из вариантов: (+-*/^%)");
            while (!scanner.hasNextLine()) {
                System.out.println("Введен не символ операции, повторите ввод");
                scanner.next();
            }
            signOperation = scanner.nextLine();
        } while (!signOperation.equals("+") &&
                    !signOperation.equals("-") &&
                    !signOperation.equals("*") &&
                    !signOperation.equals("/") &&
                    !signOperation.equals("^") &&
                    !signOperation.equals("%"));
        return signOperation;
    }
}