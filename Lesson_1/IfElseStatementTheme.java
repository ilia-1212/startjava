public class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");

        byte age = 40;

        if (age > 20) {
            System.out.println("уже не подросток");
        } else {
            System.out.println("еще подросток");
        }

        char sex = 'M';
        
        if (sex != 'M') {
            System.out.println("Это мальчик? Кто скажет ,что это девочка , пусть первый бросит в меня камень");
        }

        float height = 1.72f;
        
        if (height < 1.80) {
            System.out.println("не шпала");
        } else {
            System.out.println("вот это шпала");
        }

        String name = "ILIA";
        char firstLetter = name.charAt(0);
        
        if (firstLetter == 'M') {
            System.out.println("Миша ? ");
        } else if (firstLetter == 'I') {
            System.out.println("Илья ? ,Да");
        } else {
            System.out.println("не знаю такого имени");
        }

        //2. Поиск максимального и минимального числа
        System.out.println("2. Поиск максимального и минимального числа");

        byte a = 101;
        byte b = 4;

        if (a > b) {
            System.out.println("число a["+ a +"] больше b["+ b +"]");
        } else {
            System.out.println("число a["+ a +"] меньше b["+ b +"]");
        }

        //3. Работа с числом
        System.out.println("3. Работа с числом");

        byte c = -24;
        
        if (c % 2 == 0) {
            System.out.println("число c["+ c +"] четное");
        } else {
            System.out.println("число c["+ c +"] не четное");
        }

        if (c < 0) {
            System.out.println("число c["+ c +"] отрицательное");
        } else if (c == 0) {
            System.out.println("число c["+ c +"] равно нулю");
        } else {
            System.out.println("число c["+ c +"] положительное");
        }



        //4. Поиск общей цифры в числах
        System.out.println("4. Поиск общей цифры в числах");

        int firstData = 746;
        int secondData = 141;

        if ((firstData / 100) == (secondData / 100)) {
            System.out.println("Одинаковая цифра двух чисел " + firstData + " и " + secondData + ": " + (secondData / 100));
        } else if ((firstData % 100 / 10) == (secondData % 100 / 10)) {
            System.out.println("Одинаковая цифра двух чисел " + firstData + " и " + secondData + ": " + (firstData % 100 / 10));
        } else if ((firstData % 100 % 10) == (secondData % 100 % 10)) {
            System.out.println("Одинаковая цифра двух чисел " + firstData + " и " + secondData + ": " + (firstData % 100 % 10));
        }

        //5. Определение буквы или символа по их коду
        System.out.println("5. Определение буквы или символа по их коду");

        char sign = '\u005A';
        
        if (sign >= '\u0030' && sign <= '\u0039') {
            System.out.println("005A: число");
        } else if ((sign >='\u0041' && sign <= '\u005A') || (sign >='\u0061' && sign <= '\u007A')) {
            System.out.println("005A: буква");
        } else {
            System.out.println("005A: другой символ");
        }

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("6. Определение суммы вклада и начисленных банком %");

        float deposit = 300_000f;
        float totalPrcSum;
        float depositPrc;
        if (deposit < 100_000) {
            depositPrc = 5f * deposit / 100;
            totalPrcSum = (1 + (5f / 100)) * deposit;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            depositPrc = 7f * deposit / 100;
            totalPrcSum = (1 + (7f / 100)) * deposit;
        } else {
            depositPrc = 10f * deposit / 100;
            totalPrcSum = (1 + (10f / 100)) * deposit;
        }

        System.out.println("сумму вклада: " + deposit + "\n"+
                "начисленный %: " + depositPrc + "\n"+
                "итоговая сумму с %: " + totalPrcSum
                );

        //7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам");

        float rateSubject1 = 59;
        int mark1;
        if (rateSubject1 > 60 && rateSubject1 <= 73) {
            System.out.println("Оценка:3 по предмету: история");
            mark1 = 3;
        } else if (rateSubject1 > 73 && rateSubject1 <= 91) {
            System.out.println("Оценка:4 по предмету: история");
            mark1 = 4;
        } else if (rateSubject1 > 91) {
            System.out.println("Оценка:5 по предмету: история");
            mark1 = 5;
        } else {
            System.out.println("Оценка:2 по предмету: история");
            mark1 = 2;
        }

        float rateSubject2 = 91;
        int mark2;
        if (rateSubject2 > 60 && rateSubject2 <= 73) {
            System.out.println("Оценка:3 по предмету: программирование");
            mark2 = 3;
        } else if (rateSubject2 > 73 && rateSubject2 <= 91) {
            System.out.println("Оценка:4 по предмету: программирование");
            mark2 = 4;
        } else if (rateSubject2 > 91) {
            System.out.println("Оценка:5 по предмету: программирование");
            mark2 = 5;
        } else {
            System.out.println("Оценка:2 по предмету: программирование");
            mark2 = 2;
        }

        System.out.println("Средний бал по предметам: " + (mark1 + mark2) / 2);
        System.out.println("Средний % по предметам: " + (rateSubject1 + rateSubject2) / 2);

        //8. Расчет прибыли (убытка)
        System.out.println("8. Расчет прибыли (убытка)");

        float avgExpensesPrice = 5_000f;
        float avgRetailPrice = 15_000f;
        float avgPurchasePrice = 9_000f;

        if (((avgRetailPrice * 12) - (avgPurchasePrice * 12)) >= (avgExpensesPrice * 12)) {
            System.out.printf("Годовая прибыль: " + "%1$+9.2f" + "\n", (avgRetailPrice * 12) - (avgPurchasePrice * 12) - (avgExpensesPrice * 12));
        } else {
            System.out.printf("Годовой убыток: " + "%1$-9.2f" + "\n",(avgRetailPrice * 12) - (avgPurchasePrice * 12) - (avgExpensesPrice * 12));
        }

        //9. Определение существования треугольника
        System.out.println("9. Определение существования треугольника");

        double x = 5;
        double y = 5;
        double z = 9;
        boolean isExist;
        double triangleS;

        if ((x + y <= z) || (x + z <= y) || (y + z <= x)) {
            isExist = false;
        } else {
            isExist = true;
        }

        if (isExist) {
            // формула произвольного треугольника
            //double p = (x + y + z) /2;
            //triangleS  =(Math.sqrt(p * (p - x) * (p - y) * (p - z)));

            //формула равнобедренного треуг с 90 град углом
            triangleS = (x + z) / 2;
            System.out.printf("треугольник существует: " + ( isExist? "Да": "Нет") + " Площадь: "+ "%1$.3f" + "\n",triangleS);
        } else {
            System.out.println("треугольник не существует");
        }

        System.out.println("        / \\");
        System.out.println("       /   \\");
        System.out.println("      /     \\");
        System.out.println("     /       \\");
        System.out.println("    /_________\\");

        //10. Подсчет количества банкнот
        System.out.println("10. Подсчет количества банкнот");

        int mainVal10 = 567;
        int bill1 = 1;
        int bill2 = 10;
        int bill3 = 50;
        int hundredVal10 = (mainVal10 / bill3);
        int tensVal10 = (mainVal10 % bill3 / bill2);
        int unitsVal10 = (mainVal10 % bill3 % bill2);

        System.out.printf("номиналы банкнот и их требуемое количество:\n" + 
                "%1$s (%4$s), %2$s (%5$s), %3$s (%6$s) для формирование суммы: %7$s" ,
                bill1,bill2,bill3,unitsVal10,tensVal10,hundredVal10,mainVal10);
    }
}