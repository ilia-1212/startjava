public class GuessNumber {
    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 100;
        int guessNum = 15;
        int playerNum = 0;
        int count = 0;
        
        while (startRange < endRange -1) {
            count++;
            playerNum = (int) (startRange + endRange) / 2;
            System.out.println("Это число " + playerNum + " ?");
            if (playerNum < guessNum) {
                startRange = playerNum;
                System.out.println("Данное число " + playerNum + " меньше того, что загадал компьютер");
            } else if (playerNum > guessNum) {
                endRange = playerNum;
                System.out.println("Данное число " + playerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю, число " + playerNum + " угадано c " + count + " попытки!");
                break;
            }
        }
    }
}