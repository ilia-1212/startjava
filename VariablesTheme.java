import java.lang.String;

public class VariablesTheme {

    public static void main(String[] args) {
    //1. Создание переменных и вывод их значений на консоль (это название задачи)
    System.out.println("1. Создание переменных и вывод их значений на консоль");

    byte genProc = 7;
    short typeOs = 64;
    char firstCharName = 'I';
    int hddVolumeMB = 2_097_152;
    long totalAmountUsersOs = 1_300_000_000;
    float ramValueMB = 16384.00f;
    double totalAmountCostOs = 41_700_000_000.00d;
    boolean Activate = true;

    System.out.println("Характеристики ПК:\n" +
                "Поколение процессора: " + genProc + "\n" +
                "Тип ОС 32/64: "  + typeOs + "\n" +
                "Первая буква в имени пользователя: " + firstCharName + "\n" +
                "Обьем жесткого диска: " + hddVolumeMB + "\n" +
                "Обьем оперативной памяти: " + String.format("%.0f",ramValueMB) + "\n" +
                "Общее кол-во пользователй ОС в мире: " + totalAmountUsersOs + "\n" +
                "текущий - объем выручки за ОС в мире: " + String.format("%.2f",totalAmountCostOs) + "\n" +
                "ОС активирована: " + Activate);

    //2. Расчет стоимости товара со скидкой
    System.out.println("2. Расчет стоимости товара со скидкой");

    float goodXCostValue = 100.00f;
    float goodYCostValue = 200.00f;
    float discountPrcValue = 11.00f;
    float totalSummGoodsDiscount;
    float totalSummDiscount;

    totalSummDiscount = (goodXCostValue * discountPrcValue/100)+(goodYCostValue * discountPrcValue/100);
    totalSummGoodsDiscount = goodXCostValue + goodYCostValue - totalSummDiscount;

    System.out.println("итоговая сумма товаров со скидкой: " + String.format("%.2f",totalSummGoodsDiscount)+ "\n" +
                "сумму скидки: " + String.format("%.2f",totalSummDiscount));

    //3. Вывод на консоль слова JAVA
    System.out.println("3.  Вывод на консоль слова JAVA");

    System.out.println("   J    a  v     v  a   ");
    System.out.println("   J   a a  v   v  a a  ");
    System.out.println("J  J  aaaaa  V V  aaaaa ");
    System.out.println(" JJ  a     a  V  a     a");

    //4. Отображение min и max значений числовых типов данных
    System.out.println("4. Отображение min и max значений числовых типов данных");

    byte byteValue = 127;
    short shortValue = 32767;
    int intValue = 2147483647;
    long longValue = 9223372036854775807L;
    float floatValue = 3.4E+38f;
    double doubleValue = 1.7E+308d;

    System.out.println("Byte.MAX_VALUE = " + byteValue + "\n" + 
                    "Short.MAX_VALUE = " + shortValue + "\n" + 
                    "Integer.MAX_VALUE = " + intValue + "\n" + 
                    "Long.MAX_VALUE = " + longValue + "\n" + 
                    "Float.MAX_VALUE = " + floatValue + "\n" + 
                    "Double.MAX_VALUE = " + doubleValue);

    byteValue = (byte)(byteValue + 1);
    shortValue = (short)(shortValue + 1);
    intValue = (intValue + 1);
    longValue = (longValue + 1);
    floatValue = (floatValue + 1);
    doubleValue = (doubleValue + 1);

    System.out.println("Byte.MAX_VALUE(+1) = " + byteValue + "\n" + 
                    "Short.MAX_VALUE(+1) = " + shortValue + "\n" + 
                    "Integer.MAX_VALUE(+1) = " + intValue + "\n" + 
                    "Long.MAX_VALUE(+1) = " + longValue + "\n" + 
                    "Float.MAX_VALUE(+1) = " + floatValue + "\n" + 
                    "Double.MAX_VALUE(+1) = " + doubleValue);

    byteValue = (byte)(byteValue - 1);
    shortValue = (short)(shortValue - 1);
    intValue = (intValue - 1);
    longValue = (longValue - 1);
    floatValue = (floatValue - 1);
    doubleValue = (doubleValue - 1);

    System.out.println("Byte.MIN_VALUE(-1) = " + byteValue + "\n" + 
                    "Short.MIN_VALUE(-1) = " + shortValue + "\n" + 
                    "Integer.MIN_VALUE(-1) = " + intValue + "\n" + 
                    "Long.MIN_VALUE(-1) = " + longValue + "\n" + 
                    "Float.MIN_VALUE(-1) = " + floatValue + "\n" + 
                    "Double.MIN_VALUE(-1) = " + doubleValue);

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

    short mainVal = 345;
    short hundredVal;
    short tensVal;
    short unitsVal;

    hundredVal = (short)(mainVal/100);
    tensVal = (short)((mainVal - (hundredVal*100))/10);
    unitsVal = (short)((mainVal -(hundredVal*100)) - (tensVal*10));
    System.out.println("Произведение цифр числа:  "+mainVal+ " = " + (hundredVal * tensVal * unitsVal));
    System.out.println("Сумма цифр числа:  "+mainVal+ " = " + (hundredVal + tensVal + unitsVal));

    //8. Вывод на консоль ascii-арт Дюка
    System.out.println("8. Вывод на консоль ascii-арт Дюка");

    char vDk1 = '/';
    char vDk2 = '\\';
    char vDk3 = '_';
    char vDk4 = '(';
    char vDk5 = ')';

    System.out.println("       " + vDk1 + " "+vDk2);
    System.out.println("      "+ vDk1 +"   " + vDk2);
    System.out.println("     "+ vDk1 +vDk3+vDk4+" "+vDk5+vDk3+vDk2);
    System.out.println("    "+ vDk1 +"       "+ vDk2);
    System.out.println("   "+ vDk1 +vDk3+vDk3+vDk3+vDk1+vDk2+vDk3+vDk3+vDk3+vDk3+vDk2);

    //9. Отображение сотен, десятков, единиц числа
    System.out.println("9. Отображение сотен, десятков, единиц числа");

    short main9Val = 123;
    short hundred9Val;
    short tens9Val;
    short units9Val;

    hundred9Val = (short)(main9Val/100);
    tens9Val = (short)((main9Val - (hundred9Val*100))/10);
    units9Val = (short)((main9Val -(hundred9Val*100)) - (tens9Val*10));
    System.out.println("Отображение числа:  "+main9Val+ ":\n" +
                "Сотни: " + hundred9Val + "\n"+
                "Десятки: " + tens9Val + "\n"+
                "Единицы: " + units9Val);

    //10. Преобразование секунд
    System.out.println("10. Преобразование секунд");

    int main10Val = 86399;
    int hh10Val;
    int mm10Val;
    int ss10Val;

    hh10Val =  (main10Val/3600);
    mm10Val =  (main10Val - (hh10Val*3600))/60;
    ss10Val =  (main10Val -(hh10Val*3600)) - (mm10Val*60);
    System.out.println("Отображение времени (с):  "+main10Val+ ":\n" +
                String.format("ЧЧ:ММ:CC %1$d:%2$d:%3$d",hh10Val, mm10Val, ss10Val));

    }
}