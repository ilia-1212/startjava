public class NumberGame {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        int pc = 15;
        int mid = 0;
        int k = 1;
        
        while (a < b -1) {
            mid = (int) (a + b) / 2;
            System.out.println("Это число " + mid + " ?");
            if (mid < pc) {
                a = mid;
                System.out.println("Данное число " + mid + " меньше того, что загадал компьютер");
            } else if (mid > pc) {
                b = mid;
                System.out.println("Данное число " + mid + " больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю, число " + mid + " угадано c " + k + " попытки!");
                break;
            }
            k++;
        }
    }
}