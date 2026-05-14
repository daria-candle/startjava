package com.startjava.lesson_1.final_;

import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        int hiddenNumber = new Random().nextInt(minNumber, maxNumber + 1);
        Random random = new Random();
        int playerNumber;
        do {
            playerNumber = random.nextInt(minNumber, maxNumber + 1);
            if (playerNumber > hiddenNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
                maxNumber = playerNumber - 1;
            } else if (playerNumber < hiddenNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
                minNumber = playerNumber + 1;
            } else {
                break;
            }
        } while (true);
        System.out.println(playerNumber + " - число угадано! Вы победили!");
    }
}