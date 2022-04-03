package com.startjava.lesson_2_3.wolf;

import java.util.Scanner;

public class WolfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wolf wolf = new Wolf();
        String name = scanner.next();
        System.out.println("name = " + name);
        // String name = wolf.setSex('M');
        // wolf.setNickname("Stark");
        // wolf.setWeight(7.8f);
        // wolf.setAge(10);
        // wolf.setColor("b/w");

        // System.out.println("nickname: " + wolf.getNickname() + "\n" +
        //     "sex: " + wolf.getSex() + "\n" + 
        //     "weight: " + wolf.getWeight() + "\n" + 
        //     "age: " + wolf.getAge() + "\n" + 
        //     "color: " + wolf.getColor() + "\n");
        // wolf.bark();
        // wolf.run();
        // wolf.hunt();
        // wolf.sit();
        // wolf.go();
    }
}