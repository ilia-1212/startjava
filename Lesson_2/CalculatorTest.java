import java.util.Scanner;

public class CalculatorTest {
    private Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Calculator cl = new Calculator();

            System.out.print("Введите первое число, ");
            int numberOperation;
            do {
                System.out.println("должно быть целое и положительное, (0, 100]");
                while (!scanner.hasNextInt()) {
                    System.out.println("Введено не число, повторите ввод");
                    scanner.next();
                }
                numberOperation = scanner.nextInt();
            } while (numberOperation < 0 || numberOperation > 100);
            cl.setNum1(numberOperation);
            scanner = null;
            
            scanner = new Scanner(System.in);
            System.out.print("Введите знак операции, ");
            String mathOperation;
            do {
                System.out.println("допустимо значение из вариантов: (+-*/^%)");
                while (!scanner.hasNextLine()) {
                    System.out.println("Введен не символ операции, повторите ввод");
                    scanner.next();
                }
                mathOperation = scanner.nextLine();
            } while (!mathOperation.equals("+") && !mathOperation.equals("-") && !mathOperation.equals("*") && !mathOperation.equals("/") && !mathOperation.equals("^") && !mathOperation.equals("%"));
            cl.setSign(mathOperation);
            scanner = null;

            scanner = new Scanner(System.in);
            System.out.print("Введите второе число, ");
            do {
                System.out.println("должно быть целое и положительное, в диапазоне: (0, 100]");
                while (!scanner.hasNextInt()) {
                    System.out.println("Введено не число, повторите ввод");
                    scanner.next();
                }
                numberOperation = scanner.nextInt();
            } while (numberOperation < 0 || numberOperation > 100);
            cl.setNum2(numberOperation);
            scanner = null;

            cl.calculate();
            System.out.printf("результат = " + "%.2f" + "\n", cl.getResult());

            scanner = new Scanner(System.in);
            boolean isContinued = true;
            String ansValue = "";
            System.out.print("Хотите продолжить вычисления? ");
            while (isContinued) {
                System.out.println("Допустимы только значения: (yes/no):");
                ansValue = scanner.nextLine();
                
                if (ansValue.equals("no")) isContinued = false;
                else if (ansValue.equals("yes")) isContinued = false;
                else isContinued = true;
            }
            if (!isContinued && ansValue.equals("no")) break;
        }
        scanner.close();
    }
}