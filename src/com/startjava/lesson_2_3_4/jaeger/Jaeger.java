package com.startjava.lesson_2_3_4.jaeger;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private boolean isWeaponActivated;

    public Jaeger() {
        this("","","");
    }

    public Jaeger(String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("Робот: %s, модель %s, производство %s \nХарактеристики: высота %f, вес %f" + "\n" +
            "ТТХ: прочность %d, вооружение %d\n",
            modelName, mark, origin, height, weight, strength, armor);
    }

    //modelName
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {System.out.println("Пустое значение (имя)");}
        else this.modelName = modelName;
    }

    //mark
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark == "") {System.out.println("Пустое значение (модель)");}
        else this.mark = mark;
    }

    //origin
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        if (origin == "") {System.out.println("Пустое значение (Страна производства)");}
        else this.origin = origin;
    }

    //height
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height <= 0f) {System.out.println("нулевое(или отрицательное) значение (Высота)");}
        else this.height = height;
    }

    //weight
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0f) {System.out.println("нулевое(или отрицательное) значение (Вес)");}
        else this.weight = weight;
    }

    //strength
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength <= 0) {System.out.println("нулевое(или отрицательное) значение (прочность)");}
        else this.strength = strength;
    }

    //armor
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor <= 0) {System.out.println("нулевое(или отрицательное) значение (вооружение)");}
        else this.armor = armor;
    }

    public boolean drift() {
        System.out.println(modelName + " вошел в дрифт");
        return true;
    }

    public void move() {
        move(5);
    }

    public void move(int step) {
        System.out.println(modelName + " прошел " + step + " шаг(ов)");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useCannon() {
        if (modelName == "Bracer Phoenix") useVortexCannon();
        else if (modelName == "Gipsy Danger") usePlasmaCannon();
        else if (modelName == "Striker Eureka") useStingBladesCannon();
        else System.out.println("вооружение отсутсвует");
    }

    private void useVortexCannon() {
        if (isWeaponActivated) {
            System.out.println("VortexCannon деактивирован");
            isWeaponActivated = false;
        }
        else {
            System.out.println("VortexCannon активирован");
            isWeaponActivated = true;
        }
    }

    private void usePlasmaCannon() {
        if (isWeaponActivated) {
            System.out.println("PlasmaCannon деактивирован");
            isWeaponActivated = false;
        }
        else {
            System.out.println("PlasmaCannon активирован");
            isWeaponActivated = true;
        }
    }

    private void useStingBladesCannon() {
        if (isWeaponActivated) {
            System.out.println("StingBladesCannon деактивирован");
            isWeaponActivated = false;
        }
        else {
            System.out.println("StingBladesCannon активирован");
            isWeaponActivated = true;
        }
    }
}