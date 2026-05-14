package com.startjava.lesson_1.final_;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        char operator = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectResult = false;
        do {
            try {
                System.out.print("Введите первый операнд (натур. число): ");
                operand1 = scanner.nextInt();
                System.out.print("Введите операцию (символ): ");
                operator = scanner.next().charAt(0);
                System.out.print("Введите второй операнд (натур. число): ");
                operand2 = scanner.nextInt();
                if (operand1 <= 0 || operand2 <= 0) {
                    System.out.println("Введено не натуральное число. Повторите ввод");
                    isCorrectResult = false;
                } else {
                    isCorrectResult = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: " + e.getMessage() + "\nПовторите ввод");
                
                // Очистить буфер ввода
                scanner.nextLine(); 
                isCorrectResult = false;
            }
        } while (!isCorrectResult);
        scanner.close();
        float result;
        if (operator == '+') {
            result = operand1 + operand2;
        } else if (operator == '-') {
            result = operand1 - operand2;
        } else if (operator == '*') {
            result = operand1 * operand2;
        } else if (operator == '/') {
            result = (float) operand1 / operand2;
        } else if (operator == '%') {
            result = operand1 % operand2;
        } else if (operator == '^') {
            result = operand1;
            for (int i = 2; i <= operand2; i++) {
                result *= operand1;
            }
        } else {
            System.out.println("Введенный символ не является математическим оператором");
            return;
        }
        System.out.printf("%d %c %d = %.4f", operand1, operator, operand2, result);
    }
}