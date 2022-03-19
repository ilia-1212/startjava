public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex('M');
        wolf.setNickname("Stark");
        wolf.setWeight(7.8f);
        wolf.setAge(10);
        wolf.setColor("b/w");

        System.out.println("nickname: " + wolf.getNickname() + "\n" +
            "sex: " + wolf.getSex() + "\n" + 
            "weight: " + wolf.getWeight() + "\n" + 
            "age: " + wolf.getAge() + "\n" + 
            "color: " + wolf.getColor() + "\n");
        wolf.bark();
        wolf.run();
        wolf.hunt();
        wolf.sit();
        wolf.go();
    }
}