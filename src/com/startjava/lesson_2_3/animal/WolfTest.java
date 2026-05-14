package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender('м');
        wolf.setName("Акела");
        wolf.setWeight(43.2f);
        wolf.setAge(10);
        wolf.setColor("серый");
        System.out.println("пол: " + wolf.getGender());
        System.out.println("кличка: " + wolf.getName());
        System.out.println("вес: " + wolf.getWeight());
        System.out.println("возраст: " + wolf.getAge());
        System.out.println("окрас: " + wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}