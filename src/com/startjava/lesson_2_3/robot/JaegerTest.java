package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("United States of America");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(1.980f);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);
        System.out.println("ModelName: " + gipsyDanger.getModelName());
        System.out.println("Mark: " + gipsyDanger.getMark());
        System.out.println("Origin: " + gipsyDanger.getOrigin());
        System.out.println("Height: " + gipsyDanger.getHeight());
        System.out.println("Weight: " + gipsyDanger.getWeight());
        System.out.println("Speed: " + gipsyDanger.getSpeed());
        System.out.println("Strength: " + gipsyDanger.getStrength());
        System.out.println("Armor: " + gipsyDanger.getArmor());
        gipsyDanger.drift();
        gipsyDanger.move();
        gipsyDanger.attack();
        
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 10, 10, 9);
        System.out.println("\nModelName: " + strikerEureka.getModelName());
        System.out.println("Mark: " + strikerEureka.getMark());
        System.out.println("Origin: " + strikerEureka.getOrigin());
        System.out.println("Height: " + strikerEureka.getHeight());
        System.out.println("Weight: " + strikerEureka.getWeight());
        System.out.println("Speed: " + strikerEureka.getSpeed());
        System.out.println("Strength: " + strikerEureka.getStrength());
        System.out.println("Armor: " + strikerEureka.getArmor());
        strikerEureka.drift();
        strikerEureka.move();
        strikerEureka.attack();
    }
}