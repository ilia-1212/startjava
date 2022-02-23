public class Calculator {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        double result = 0;
        char sign = '+';

        a = -5;
        b = 6;
        result = calculate(a, b, sign);
        System.out.printf("Операция: " + sign + " над числами " + a + ", " + b + " = " + "%1$.0f" + "\n", result);
        a = 5;
        b = 6;
        result = calculate(a, b, sign);
        System.out.printf("Операция: " + sign + " над числами " + a + ", " + b + " = " + "%1$.0f" + "\n", result);
        a = 8;
        b = 100;
        sign = '-';
        result = calculate(a, b, sign);
        System.out.printf("Операция: " + sign + " над числами " + a + ", " + b + " = " + "%1$.0f" + "\n", result);
        a = 9;
        b = 12;
        sign = '*';
        result = calculate(a, b, sign);
        System.out.printf("Операция: " + sign + " над числами " + a + ", " + b + " = " + "%1$.0f" + "\n", result);
        a = 50;
        b = 4;
        sign = '/';
        result = calculate(a, b, sign);
        System.out.printf("Операция: " + sign + " над числами " + a + ", " + b + " = " + "%1$.2f" + "\n", result);
        a = 5;
        b = 3;
        sign = '^';
        result = calculate(a, b, sign);
        System.out.printf("Операция: " + sign + " над числами " + a + ", " + b + " = " + "%1$.0f" + "\n", result);
        a = 5;
        b = 3;
        sign = '%';
        result = calculate(a, b, sign);
        System.out.printf("Операция: " + "mod"+ " над числами " + a + ", " + b + " = " + "%1$.0f" + "\n", result);
    }

    private double calculate(int a, int b, char sign) {
        double result = 0;

        if (a < 0 || b < 0) {
            System.out.println("Вычисление выполняется только над целыми положительными числами");
            return 0;
        }

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = (double) a / b;
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else result = 0;
        
        return result;
    }
}