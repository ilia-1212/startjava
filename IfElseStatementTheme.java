public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java (это название задачи)
        System.out.println("1. Перевод псевдокода на язык Java");

        byte age = 40;
        char sex = 'M';
        float height = 1.72f;
        String namePerson = "ILIA";
        char firstLetterName;

        if (age > 20){
            System.out.println("уже не подросток");
        } else {
            System.out.println("еще подросток");
        }

        if (!(sex == 'M')){
            System.out.println("Это мальчик? Кто скажет ,ч то это деовчка , пусть первый бросит в меня камень");
        }

        if (height < 1.80){
            System.out.println("не шпала");
        } else {
            System.out.println("вот это шпала");
        }

        firstLetterName = namePerson.charAt(0);
        if (firstLetterName == 'M'){
            System.out.println("Миша ? ");
        } else if (firstLetterName == 'I') {
            System.out.println("Илья ? ,Да");
        } else {
            System.out.println("не знаю такого имени");
        }

        //2. Поиск максимального и минимального числа
        System.out.println("2. Поиск максимального и минимального числа");

        byte a = 101;
        byte b = 4;

        if (a > b){
            System.out.println("число a["+ a +"] больше b["+ b +"]");
        } else {
            System.out.println("число a["+ a +"] меньше b["+ b +"]");
        }

        //3. Работа с числом
        System.out.println("3. Работа с числом");

        byte c = -24;
        if (c % 2 == 0){
            System.out.println("число c["+ c +"] четное");
        } else {
            System.out.println("число c["+ c +"] не четное");
        } 

        if (c < 0) {
            System.out.println("число c["+ c +"] отрицательное");
        } else {
            System.out.println("число c["+ c +"] положительное");
        }

        if (c == 0){
            System.out.println("число c["+ c +"] равно нулю");
        } else {
            System.out.println("число c["+ c +"] не равно нулю");
        }

        //4. Поиск общей цифры в числах
        System.out.println("4. Поиск общей цифры в числах");

        short firstData = 746;
        short secondData = 141;

        short hundred1Val;
        short tens1Val;
        short units1Val;

        hundred1Val = (short)(firstData/100);
        tens1Val = (short)((firstData - (hundred1Val*100))/10);
        units1Val = (short)((firstData -(hundred1Val*100)) - (tens1Val*10));

        short hundred2Val;
        short tens2Val;
        short units2Val;

        hundred2Val = (short)(secondData/100);
        tens2Val = (short)((secondData - (hundred2Val*100))/10);
        units2Val = (short)((secondData -(hundred2Val*100)) - (tens2Val*10));

        if (hundred1Val == hundred2Val) {
            System.out.println("Одинаковая цифра двух чисел " +firstData + " и " + secondData + ": " + hundred1Val);
        } else if (tens1Val == tens2Val) {
            System.out.println("Одинаковая цифра двух чисел " +firstData + " и " + secondData + ": " + tens1Val);
        } else if (units1Val == units2Val) {
            System.out.println("Одинаковая цифра двух чисел " +firstData + " и " + secondData + ": " + units1Val);
        }

        //5. Определение буквы или символа по их коду
        System.out.println("5. Определение буквы или символа по их коду");

        char sign = '\u005A';

        if (sign >='\u0030' && sign <= '\u0039') {
            System.out.println("005A: число");
        } else if ((sign >='\u0041' && sign <= '\u005A') || (sign >='\u0061' && sign <= '\u007A')) {
            System.out.println("005A: буква");
        } else {
            System.out.println("005A: другой символ");
        }

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("6. Определение суммы вклада и начисленных банком %");

        float depositSum = 300_000f;
        float depositPrc;
        float prcRate;
        float totalPrcSum;

        if (depositSum < 100_000){
            prcRate = 5f;
        } else if (depositSum >= 100_000 && depositSum <= 300_000) {
            prcRate = 7f;
        } else prcRate = 10f;

        depositPrc = prcRate*depositSum/100;
        totalPrcSum = (1 + (prcRate / 100)) * depositSum;

        System.out.println("сумму вклада: " + depositSum + "\n"+
                "начисленный %: " + depositPrc + "\n"+
                "итоговая сумму с %: " + totalPrcSum
                );

        //7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам");

        float rateSubject;
        String nameSubject;
        byte mark;

        nameSubject = "история";
        rateSubject = 59;
        if (rateSubject > 60 && rateSubject <= 73) {
            mark = 3;
        } else if (rateSubject > 73 && rateSubject <= 91) {
            mark = 4;
        } else if (rateSubject > 91) {
            mark = 5;
        } else mark = 2;

        System.out.println("Оценка: " + mark + " по предмету: " + nameSubject);

        byte mark1 = mark;
        float rateSubject1 = rateSubject;
        String nameSubject1 = nameSubject;

        nameSubject = "программирование";
        rateSubject = 91;
        if (rateSubject > 60 && rateSubject <= 73) {
            mark = 3;
        } else if (rateSubject > 73 && rateSubject <= 91) {
            mark = 4;
        } else if (rateSubject > 91) {
            mark = 5;
        } else mark = 2;

        System.out.println("Оценка: " + mark + " по предмету: " + nameSubject);

        byte mark2 = mark;
        float rateSubject2 = rateSubject;
        String nameSubject2 = nameSubject;

        System.out.println("Средний бал по предметам: " + (mark1 + mark2) / 2);
        System.out.println("Средний % по предметам: " + (rateSubject1 + rateSubject2) / 2);

        //8. Расчет прибыли (убытка)
        System.out.println("8. Расчет прибыли (убытка)");

        float avgExpensesPrice = 5_000f;
        float avgRetailPrice = 15_000f;
        float avgPurchasePrice = 9_000f;
        float totalExpensesPrice;
        float totalRetailPrice;
        float totalPurchasePrice;

        totalExpensesPrice = avgExpensesPrice * 12;
        totalRetailPrice = avgRetailPrice * 12;
        totalPurchasePrice = avgPurchasePrice * 12;

        if ((totalRetailPrice-totalPurchasePrice) >= totalExpensesPrice) {
            System.out.println("Годовая прибыль: " + String.format("%1$+9.2f", totalRetailPrice - totalPurchasePrice - totalExpensesPrice));
        } else {
            System.out.println("Годовой убыток: " + String.format("%1$-9.2f",totalRetailPrice - totalPurchasePrice - totalExpensesPrice));
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
            double p = (x + y + z) /2;
            triangleS  =(Math.sqrt(p * (p - x) * (p - y) * (p - z)));
            System.out.println("треугольник существует: " +( isExist? "Да": "Нет") + " Площадь: "+ triangleS);
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

  }
}