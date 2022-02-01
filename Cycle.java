public class Cycle{
    public static void main(String[] args) {
        System.out.println("Цикл for");
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("Цикл while");
        int y = 6;
        while (y >=- 6) {
            System.out.println(y);
            y -= 2;
        }

        System.out.println("Цикл do while");
        int z = 10;
        int summOdd = 0;
        do {
            if (z % 2 != 0) {
                summOdd =+ z;
            } 
            z++;
        } while (z < 21);
        System.out.println("сумма нечетных чисел '[10;20]' равна: " + summOdd);
    }
}