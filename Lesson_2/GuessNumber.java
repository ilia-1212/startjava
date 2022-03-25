public class GuessNumber {
    private static int guessNum;
    private static boolean isFinished;
    private Player player1;
    private Player player2;

    public GuessNumber() {
        if (guessNum == 0) {
            guessNum = (int) (Math.random() * 100);
            isFinished = false;
        }
    }

    public GuessNumber(Player player1, Player player2) {
        this();
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean getIsFinished() {
        return isFinished;
    }

    public void guess() {
        System.out.println("Угадываем число " + guessNum);
        if ((guessNum == player1.getNum()) || (guessNum == player2.getNum())) {
            System.out.println("Вы угадали!");
            isFinished = true;
        }
        else if ((guessNum < player1.getNum()) || (guessNum < player2.getNum())) System.out.println("Вы ввели число больше, чем загадал компьютер");
        else if ((guessNum > player1.getNum()) || (guessNum > player2.getNum())) System.out.println("Вы ввели число меньше, чем загадал компьютер");
        }
}