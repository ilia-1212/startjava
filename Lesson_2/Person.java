public class Person {

    private char sex = 'M';
    private String name = "Ilia";
    private float height = 171f;
    private float weight = 72.5f;
    private int age = 39;

    public char getSex() {
        return sex;
    }

    public void setSex(char sx) {
        sex = sx;
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        name = nm;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float hg) {
        height = hg;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float wg) {
        weight = wg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //сидеть
    public void sit() {
        System.out.println("человек " + name + " присел");
    }

    //праздновать ДР
    public int celebrateHb() {
        age++;
        System.out.println("человек " + name + " отметил ДР и теперь ему " + age + "лет");
        return age;
    }

    //идти
    public void go() {
        System.out.println("человек " + name + " пошел");
    }
    //бежать
    public void run() {
        System.out.println("человек " + name + " бежит");
    }
    //говорить
    public void talk() {
        System.out.println("человек " + name + " говорит");
    }

    //учить
    public void learn(String subj) {
        System.out.println("человек " + name + " учит " + subj);
    }
}