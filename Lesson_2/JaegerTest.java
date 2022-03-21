public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robotOne = new Jaeger();
        robotOne.setModelName("Bracer Phoenix");
        robotOne.setMark("Mark-5");
        robotOne.setOrigin("USA");
        robotOne.setHeight(70.91f);
        robotOne.setWeight(2.128f);
        robotOne.setStrength(5);
        robotOne.setArmor(4);
        System.out.println(robotOne.getModelName());
        System.out.println(robotOne.getArmor());
        robotOne.useCannon();
        robotOne.useCannon();
        robotOne.setArmor(2);
        System.out.println(robotOne.getArmor());
        
        Jaeger robotTwo = new Jaeger();
        robotTwo.setModelName("Gipsy Danger");
        robotTwo.setMark("Mark-3");
        robotTwo.setOrigin("USA");
        robotTwo.setHeight(79.25f);
        robotTwo.setWeight(1.980f);
        robotTwo.setStrength(8);
        robotTwo.setArmor(6);
        System.out.println(robotTwo.getModelName());
        robotTwo.useCannon();
        robotTwo.useCannon();

        Jaeger robotThree= new Jaeger();
        robotThree.setModelName("Striker Eureka");
        robotThree.setMark("Mark-5");
        robotThree.setOrigin("Australia");
        robotThree.setHeight(76.2f);
        robotThree.setWeight(1.850f);
        robotThree.setStrength(10);
        robotThree.setArmor(9);
        System.out.println(robotThree.getModelName());
        robotThree.useCannon();
        robotThree.useCannon();
    }
}