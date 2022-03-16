public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfObj = new Wolf();
        wolfObj.sex = 'M';
        wolfObj.nickname = "Stark";
        wolfObj.weight = 7.8f;
        wolfObj.age = 10;
        wolfObj.color = "b/w";

        System.out.println("nickname: " + wolfObj.nickname + "\n" +
            "sex: " + wolfObj.sex + "\n" + 
            "weight: " + wolfObj.weight + "\n" + 
            "age: " + wolfObj.age + "\n" + 
            "color: " + wolfObj.color + "\n");
        wolfObj.bark();
        wolfObj.run();
        wolfObj.hunt();
        wolfObj.sit();
        wolfObj.go();
    }
}