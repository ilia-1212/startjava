import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner nm1 = new Scanner(System.in);
        Scanner oper = new Scanner(System.in);
        Scanner nm2 = new Scanner(System.in);
        Scanner ask = new Scanner(System.in);

        while (true) {
            Calculator cl = new Calculator();

            System.out.println("Введите первое число");
            cl.setNum1(inputNum(nm1));

            System.out.println("Введите знак операции");
            cl.setSign(inputOper(oper));

            System.out.println("Введите второе  число");
            cl.setNum2(inputNum(nm2));

            double result = 0;
            int continueMode = 2;

            result = cl.calculate();
            System.out.printf("Операция: " + cl.getSign() + " над числами " + cl.getNum1() + ", " + cl.getNum2() + " = " + "%1$.0f" + "\n", result);
            
            String askValue;
            while (continueMode == 2) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                askValue = ask.nextLine();
                
                if (askValue.equals("no")) continueMode = 0;
                else if (askValue.equals("yes")) continueMode = 1;
                else continueMode = 2;
            }
            if (continueMode == 0) break;
        }
        nm1.close();
        oper.close();
        nm2.close();
        ask.close();
    }

    static int inputNum(Scanner sc) {
        int num;
        do {
            System.out.println("Введите целое положительное число");
            while (!sc.hasNextInt()) {
                System.out.println("Неправильный ввод");
                sc.next();
            }
            num = sc.nextInt();
        } while (num < 0);
        return num;
    }

    static String inputOper(Scanner sc) {
        String num;
        do {
            System.out.println("Введите операцию +-*/^%");
            while (!sc.hasNextLine()) {
                System.out.println("Неправильный ввод");
                sc.next();
            }
            num = sc.nextLine();
        } while (!num.equals("+") && !num.equals("-") && !num.equals("*") && !num.equals("/") && !num.equals("^") && !num.equals("%"));
        return num;
    }
}