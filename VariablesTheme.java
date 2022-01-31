public class VariablesTheme {

    public static void main(String[] args) {
        //1. Создание переменных и вывод их значений на консоль
        System.out.println("1. Создание переменных и вывод их значений на консоль");

        byte genProc = 7;
        short typeOs = 64;
        char firstCharName = 'I';
        int hddVolumeMB = 2_097_152;
        long totalAmountUsersOs = 1_300_000_000;
        float ramValueMb = 16384.00f;
        double totalAmountCostOs = 41_700_000_000.00d;
        boolean activated = true;

        System.out.println("Характеристики ПК:\n" +
                    "Поколение процессора: " + genProc + "\n" +
                    "Тип ОС 32/64: "  + typeOs + "\n" +
                    "Первая буква в имени пользователя: " + firstCharName + "\n" +
                    "Обьем жесткого диска: " + hddVolumeMB + "\n" +
                    "Обьем оперативной памяти: " + String.format("%.0f",ramValueMb) + "\n" +
                    "Общее кол-во пользователй ОС в мире: " + totalAmountUsersOs + "\n" +
                    "текущий - объем выручки за ОС в мире: " + String.format("%.2f",totalAmountCostOs) + "\n" +
                    "ОС активирована: " + activated);

        //2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой");

        float goodXCostValue = 100.00f;
        float goodYCostValue = 200.00f;
        float discount = 11.00f;
        float totalCost;
        float totalSummDiscount;

        totalSummDiscount = (goodXCostValue + goodYCostValue) * discount / 100;
        totalCost = goodXCostValue + goodYCostValue - totalSummDiscount;

        System.out.println("итоговая сумма товаров со скидкой: " + String.format("%.2f",totalCost)+ "\n" +
                    "сумму скидки: " + String.format("%.2f",totalSummDiscount));

        //3. Вывод на консоль слова JAVA
        System.out.println("3.  Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        //4. Отображение min и max значений числовых типов данных
        System.out.println("4. Отображение min и max значений числовых типов данных");

        byte byteMaxMin = 127;
        short shortMaxMin = 32767;
        int intMaxMin = 2147483647;
        long longMaxMin = 9223372036854775807L;
        float floatMaxMin = 3.4E+38f;
        double doubleMaxMin = 1.7E+308d;

        System.out.println("byte (max) = " + byteMaxMin + "\n" + 
                        "short (max) = " + shortMaxMin + "\n" + 
                        "int (max) = " + intMaxMin + "\n" + 
                        "long (max) = " + longMaxMin + "\n" + 
                        "float (max) = " + floatMaxMin + "\n" + 
                        "double (max) = " + doubleMaxMin);


        System.out.println("byte (+1) = " + ++byteMaxMin + "\n" + 
                        "short (+1) = " + ++shortMaxMin + "\n" + 
                        "int (+1) = " + ++intMaxMin + "\n" + 
                        "long (+1) = " + ++longMaxMin + "\n" + 
                        "float (+1) = " + ++floatMaxMin + "\n" + 
                        "double (+1) = " + ++doubleMaxMin);



        System.out.println("byte (-1) = " + --byteMaxMin + "\n" + 
                        "short (-1) = " + --shortMaxMin + "\n" + 
                        "int (-1) = " + --intMaxMin + "\n" + 
                        "long (-1) = " + --longMaxMin + "\n" + 
                        "float (-1) = " + --floatMaxMin + "\n" + 
                        "double (-1) = " + --doubleMaxMin);

        //5. Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных");

        float v1 = 1f;
        float v2 = 2f;
        float vTemp;
        System.out.println("var 1 = " + v1+ " var2 = " + v2);

        vTemp = v1;
        v1 = v2;
        v2 = vTemp;
        System.out.println("var 1 = " + v1+ " var2 = " + v2);

        //6. Вывод ASCII-символов и их кодов
        System.out.println("6. Вывод ASCII-символов и их кодов");

        byte chr1 = 35;
        byte chr2 = 38;
        byte chr3 = 64;
        byte chr4 = 94;
        byte chr5 = 95;
        
        System.out.println("chr1 value: " + chr1 + " chr: " + (char) chr1);
        System.out.println("chr2 value: " + chr2 + " chr: " + (char) chr2);
        System.out.println("chr3 value: " + chr3 + " chr: " + (char) chr3);
        System.out.println("chr4 value: " + chr4 + " chr: " + (char) chr4);
        System.out.println("chr5 value: " + chr5 + " chr: " + (char) chr5);

        //7. Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа");

        int mainVal7 = 345;
        int hundredVal7 = (mainVal7 / 100);
        int tensVal7 = (mainVal7 % 100 / 10);
        int unitsVal7 = (mainVal7 % 100 % 10);

        System.out.println("Произведение цифр числа:  "+ mainVal7 + " = " + (hundredVal7 * tensVal7 * unitsVal7));
        System.out.println("Сумма цифр числа:  " + mainVal7 + " = " + (hundredVal7 + tensVal7 + unitsVal7));

        //8. Вывод на консоль ascii-арт Дюка
        System.out.println("8. Вывод на консоль ascii-арт Дюка");

        char vDk1 = '/';
        char vDk2 = '\\';
        char vDk3 = '_';
        char vDk4 = '(';
        char vDk5 = ')';
        char vDk6 = ' ';

        System.out.println(String.format("%7s",vDk6) + vDk1 + String.format("%1s",vDk6) + vDk2);
        System.out.println(String.format("%6s",vDk6) + vDk1 + String.format("%3s",vDk6) + vDk2);
        System.out.println(String.format("%5s",vDk6) + vDk1 + vDk3 + vDk4 + String.format("%1s",vDk6) + vDk5 + vDk3 + vDk2);
        System.out.println(String.format("%4s",vDk6) + vDk1 + String.format("%7s",vDk6)+ vDk2);
        System.out.println(String.format("%3s",vDk6) + vDk1 + vDk3 + vDk3 + vDk3 + vDk1 + vDk2 + vDk3 + vDk3 + vDk3 + vDk3 + vDk2);

        //9. Отображение сотен, десятков, единиц числа
        System.out.println("9. Отображение сотен, десятков, единиц числа");

        int mainVal9 = 123;
        int hundredVal9 = (mainVal9 / 100);
        int tensVal9 = (mainVal9 % 100 / 10);
        int unitsVal9 = (mainVal9 % 100 % 10);


        System.out.println("Отображение числа:  "+mainVal9 + ":\n" +
                    "Сотни: " + hundredVal9 + "\n"+
                    "Десятки: " + tensVal9 + "\n"+
                    "Единицы: " + unitsVal9);

        //10. Преобразование секунд
        System.out.println("10. Преобразование секунд");

        int main10Val = 86399;
        int hh10Val  = (main10Val % 86400 / 3600);
        int mm10Val = (main10Val % 3600 / 60);
        int ss10Val = (main10Val % 60);

        System.out.println("Отображение времени (с):  " + main10Val + ":\n" +
                    String.format("ЧЧ:ММ:CC %1$02d:%2$02d:%3$02d",hh10Val, mm10Val, ss10Val));
    }
}