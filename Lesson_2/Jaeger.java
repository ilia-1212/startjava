public class Jaeger {
    private String modelName = "Fedor";
    private String mark = "Лютик-1";
    private String origin = "венесуэла";
    private float height = 70.7f;
    private float weight = 2.1f;
    private int strength = 8;
    private int armor = 9;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {System.out.println("Пустое имя");}
        else this.modelName = modelName;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы вошли 5 шагов");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("активирован");
    }
}