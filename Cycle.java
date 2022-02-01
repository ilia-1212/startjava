public class Cycle{
        public static void main(String [] args) {
            System.out.println("Цикл for");
            for(int x = 0; x <=20; x++) {
                    System.out.println(x + "\n");
            }

            System.out.println("Цикл while");
            int y = 6;
            while (y >=-6) {
                    System.out.println(y + "\n");
                    y-=2;
            }

            System.out.println("Цикл do while");
            int z = 10;
            int summ = 0;
            do {
                    if (z % 2 != 0) {
                        summ = summ + z;
                    } 
                    z++;
            } while (z < 21);
            System.out.println("сумма нечетных чисел '[10;20]' равна: " + summ);
        }
}