package com.startjava.Lesson_1.CyclesTheme;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Цикл for");
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("Цикл while");
        int y = 6;
        while (y >= -6) {
            System.out.println(y);
            y -= 2;
        }

        //1 Подсчет суммы четных и нечетных чисел
        System.out.println("1 Подсчет суммы четных и нечетных чисел");
        int z = -10;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (z % 2 != 0) {
                sumOdd += z;
            } else {
                sumEven =+ z;
            }
            z++;
        } while (z <= 21);
        System.out.println("сумма нечетных чисел '[-10;21]' равна: " + sumOdd);
        System.out.println("сумма четных чисел '[-10;21]' равна: " + sumEven);

        //2 Вывод чисел между max и min
        System.out.println("2 Вывод чисел между max и min");
        int[] digits = {10, 5, -1};
        int min = 0;
        int max = 0;
        for (int i : digits) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min  = i;
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

        //3 Вывод реверсивного числа и суммы его цифр
        System.out.println("3 Вывод реверсивного числа и суммы его цифр");
        int playerNum = 1234;
        int digit = 0;
        int sumDigit = 0;
        while (playerNum > 0) {
            digit = playerNum % 10;
            sumDigit += digit;
            System.out.print(digit);
            playerNum = playerNum / 10;
        }
        System.out.println("\n" + sumDigit);

        //4 Вывод чисел на консоль в несколько строк
        System.out.println("4 Вывод чисел на консоль в несколько строк");
        int k = 0;
        for (int i = 1; i < 24; i++) {
            k = k + 2;
            if (i % 5 != 0) {
                System.out.print(k + " ");
            } else {
                System.out.println(k);
            }
            //недостающее в последней строке до 5 количество чисел заполните  (не знаю как сделать)
        }

        //5 Проверка количества единиц на четность
        System.out.println("5 Проверка количества единиц на четность");
        String playerNumS = "31415191";
        char[] tempStrArr;
        int cnt1 = 0;
        tempStrArr = playerNumS.toCharArray();
        for (char i : tempStrArr) {
            System.out.println(i);
            if (i == '1') cnt1++;
        }
        if (cnt1 % 2 == 0) {
            System.out.println("Количество 1 в числе четное");
        } else {
            System.out.println("Количество 1 в числе нечетное");
        }
        //6 Отображение фигур в консоли
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        int i = 5;
        int j = 5;
        while (i > 0) {
            while (j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.print("\n");
            i--;
            j = i;
        }
        System.out.print("\n");

        //7 Отображение ASCII-символов
        // for (int i1 = 0; i1 <128; i1++) {
     
        //     System.out.printf("%1$06d   %2$3s\n",i1, (char) i1);

        // }
        //8 Проверка, является ли число палиндромом
        int polindromN = 12321;
        String polindromS = Integer.toString(polindromN);
        int forward = 0;
        int backward = polindromS.length() - 1;
        boolean IsPolindromedNum = true;
        while (backward > forward) {
            char forwardChar = polindromS.charAt(forward++);
            char backwardChar = polindromS.charAt(backward--);
            if (forwardChar != backwardChar) {IsPolindromedNum = false;}
        }
        String ResS = (IsPolindromedNum) ? "да": "нет";
        System.out.print("число " + polindromS + " является полиндромом :" + ResS);
        //9 Определение, является ли число счастливым
        //10 Вывод таблицы умножения Пифагора
        System.out.printf("\n");
        for (int i1 = 2; i1 < 10; i1++) {
            for (int j1 = 2; j1 < 10; j1++) {
                System.out.printf("%4s", i1 * j1);
            }
            System.out.printf("\n");
        }
    }
}