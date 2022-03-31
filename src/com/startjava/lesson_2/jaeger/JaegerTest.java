package com.startjava.lesson_2.jaeger;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robotOne= new Jaeger("Striker Eureka","Mark-5", "Australia");
        robotOne.setHeight(76.2f);
        robotOne.setWeight(1.850f);
        robotOne.setStrength(10);
        robotOne.setArmor(9);
        System.out.println(robotOne);
        robotOne.useCannon();
        robotOne.useCannon();
        robotOne.move(3);
        
        Jaeger robotTwo = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 8, 6);
        System.out.println(robotTwo);
        robotTwo.useCannon();
        robotTwo.useCannon();
        robotTwo.move();
        robotTwo.drift();
    }
}