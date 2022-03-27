public class Player {
    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
        this.num = 0;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}