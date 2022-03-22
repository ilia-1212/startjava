public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robotOne= new Jaeger();
        robotOne.setModelName("Striker Eureka");
        robotOne.setMark("Mark-5");
        robotOne.setOrigin("Australia");
        robotOne.setHeight(76.2f);
        robotOne.setWeight(1.850f);
        robotOne.setStrength(10);
        robotOne.setArmor(9);
        System.out.println("modelName: " + robotOne.getModelName());
        System.out.println("mark: " + robotOne.getMark());
        System.out.println("origin: " + robotOne.getOrigin());
        System.out.println("height: " + robotOne.getHeight());
        System.out.println("weight: " + robotOne.getWeight());
        System.out.println("strength: " + robotOne.getStrength());
        System.out.println("armor: " + robotOne.getArmor());
        robotOne.useCannon();
        robotOne.useCannon();
        robotOne.move(3);

        Jaeger robotTwo = new Jaeger();
        robotTwo.setModelName("Gipsy Danger");
        robotTwo.setMark("Mark-3");
        robotTwo.setOrigin("USA");
        robotTwo.setHeight(79.25f);
        robotTwo.setWeight(1.980f);
        robotTwo.setStrength(8);
        robotTwo.setArmor(6);
        robotTwo.PrintJaegerInfo();
        robotTwo.useCannon();
        robotTwo.useCannon();
        robotTwo.move();
        robotTwo.drift();
    }
}