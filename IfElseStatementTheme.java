public class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java (это название задачи)
        System.out.println("1. Перевод псевдокода на язык Java");

        byte age = 40;
        char sex = 'M';
        float height = 1.72f;
        String namePerson = "ILIA";
        char firstLetterName = namePerson.charAt(0);

        if (age > 20){
            System.out.println("уже не подросток");
        } else {
            System.out.println("еще подросток");
        }

        if (!(sex == 'M')){
            System.out.println("Это мальчик? Кто скажет ,что это девочка , пусть первый бросит в меня камень");
        }

        if (height < 1.80){
            System.out.println("не шпала");
        } else {
            System.out.println("вот это шпала");
        }

        
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

        int firstData = 746;
        int secondData = 141;

        int hundredVal41 = (firstData / 100);
        int tensVal41 = (firstData % 100 / 10);
        int unitsVal41 = (firstData % 100 % 10);

        int hundredVal42 = (secondData / 100);
        int tensVal42 = (secondData % 100 / 10);
        int unitsVal42 = (secondData % 100 % 10);

        if (hundredVal41 == hundredVal42) {
            System.out.println("Одинаковая цифра двух чисел " +firstData + " и " + secondData + ": " + hundredVal42);
        } else if (tensVal41 == tensVal42) {
            System.out.println("Одинаковая цифра двух чисел " +firstData + " и " + secondData + ": " + tensVal41);
        } else if (unitsVal41 == unitsVal42) {
            System.out.println("Одинаковая цифра двух чисел " +firstData + " и " + secondData + ": " + unitsVal41);
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
        float depositPrc;
        float prcRate;
        float totalPrcSum;

        if (deposit < 100_000){
            prcRate = 5f;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            prcRate = 7f;
        } else prcRate = 10f;

        depositPrc = prcRate * deposit / 100;
        totalPrcSum = (1 + (prcRate / 100)) * deposit;

        System.out.println("сумму вклада: " + deposit + "\n"+
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
            System.out.println("треугольник существует: " +( isExist? "Да": "Нет") + " Площадь: "+ String.format("%.3f",triangleS));
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

        String fstr = String.format("номиналы банкнот и их требуемое количество:\n" + 
                                "%1$s (%4$s), %2$s (%5$s), %3$s (%6$s) для формирование суммы: %7$s" ,
                                bill1,bill2,bill3,unitsVal10,tensVal10,hundredVal10,mainVal10);
        System.out.println(fstr);
    }
}