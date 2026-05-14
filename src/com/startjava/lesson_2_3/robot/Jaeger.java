package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, 
            float weight, int speed, int strength, int armor) {
        setModelName(modelName);
        setMark(mark);
        setOrigin(origin);
        setHeight(height);
        setWeight(weight);
        setSpeed(speed);
        setStrength(strength);
        setArmor(armor);
    }

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    void setMark(String mark) {
        if (mark == "") {
            System.out.println("Пустая строка");
        } else {
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        if (origin == "") {
            System.out.println("Пустая строка");
        } else {
            this.origin = origin;
        }
    }

    public float getHeight() {
        return height;
    }

    void setHeight(float height) {
        if (height <= 0.0) {
            System.out.println("Некорректный ввод");
        } else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        if (weight <= 0.0) {
            System.out.println("Некорректный ввод");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        if (speed <= 0) {
            System.out.println("Некорректный ввод");
        } else {
            this.speed = speed;
        }
    }

    public int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        if (strength <= 0) {
            System.out.println("Некорректный ввод");
        } else {
            this.strength = strength;
        }
    }

    public int getArmor() {
        return armor;
    }

    void setArmor(int armor) {
        if (armor <= 0) {
            System.out.println("Некорректный ввод");
        } else {
            this.armor = armor;
        }
    }

    void drift() {
        System.out.println("Вы вошли в дрифт");
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    void attack() {
        System.out.println("Вы атакуете");
    }
}