package com.startjava.lesson_2_3.person;

public class Person {

    private char sex = 'M';
    private String name = "Ilia";
    private float height = 171f;
    private float weight = 72.5f;
    private int age = 39;

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