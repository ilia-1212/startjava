public class Player {
    private String name;
    private int num;

    public Player(String name) {
        this(name, 0);
    }
    public Player(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.format("Игрок: %s ввел число %d",name, num);
    }
}