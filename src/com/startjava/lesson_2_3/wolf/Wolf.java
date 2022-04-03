package com.startjava.lesson_2_3.wolf;

public class Wolf {
    //пол, кличка, вес, возраст, окрас
    private char sex;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println(age + " не корректный возраст");
        } else this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //идти, сидеть, бежать, выть, охотиться
    public void go() {
        System.out.println("идет");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public void run() {
        System.out.println("бежит");
    }

    public void bark() {
        System.out.println("воет/лает");
    }

    public void hunt() {
        System.out.println("охотится");
    }
}