public class GuessNumber {
    public static void main(String[] args) {
        int fromNum = 0;
        int toNum = 100;
        int guessNum = 15;
        int midNum = 0;
        int count = 1;
        
        while (fromNum < toNum -1) {
            midNum = (int) (fromNum + toNum) / 2;
            System.out.println("Это число " + midNum + " ?");
            if (midNum < guessNum) {
                fromNum = midNum;
                System.out.println("Данное число " + midNum + " меньше того, что загадал компьютер");
            } else if (midNum > guessNum) {
                toNum = midNum;
                System.out.println("Данное число " + midNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю, число " + midNum + " угадано c " + count + " попытки!");
                break;
            }
            count++;
        }
    }
}