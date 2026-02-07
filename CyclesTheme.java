import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ВЫВОД ASCII-СИМВОЛОВ\n");
        System.out.printf("%s%12s%14s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int asciiCode = 33; asciiCode <= 122; asciiCode += 2) {
            if (asciiCode == 49) {
                asciiCode = 98;
            }
            System.out.printf("%4d%11c%12s%-1s%n", asciiCode, asciiCode, "", Character.getName(asciiCode));
        }

        System.out.println("\n\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");
        for (int row = 1; row <= 5; row++) {
            System.out.print("---------- ");
            for (int col = 1; col <= (6 - row); col++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int col = 1; col <= (row * 2 - 1); col++) {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println("\n\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ\n");
        for (int i = 1; i <= 9; i++) {
            if (i > 1) {
                System.out.printf("%d |", i);
            } else {
                System.out.print("  |");
            }
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
            if (i == 1) {
                System.out.println("--+------------------------");
            }
        }

        System.out.println("\n\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК\n");
        int originalNumber = 24;
        for (int i = 1; i < originalNumber;) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%2d ", i < originalNumber ? i : 0);
                i += 2;
            }
            System.out.println();
        }

        System.out.println("\n\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX\n");
        int a = 10;
        int b = 5;
        int c = -1;
        System.out.printf("Исходные числа: %d, %d, %d;%n", a, b, c);
        int min = a;
        int max = b;
        if (a > b) {
            max = a;
            min = b;
        }
        min = (min > c) ? c : min;
        max = (max < c) ? c : max;
        System.out.printf("В порядке убывания в промежутке (%d,%d):%n", min, max);
        for (int i = (max - 1); i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n\n6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ\n");
        originalNumber = 1234321;
        System.out.println("Исходное число: " + originalNumber);
        int twosCount = 0;
        boolean isPalindrome = true;
        int reversedNumber = originalNumber % 10;
        int currentNumber = originalNumber / 10;
        while (currentNumber > 0) {
            reversedNumber *= 10;
            int digit = currentNumber % 10;
            reversedNumber += digit;
            if (digit == 2) {
                twosCount++;
            }
            currentNumber /= 10;
        }
        isPalindrome = (originalNumber != reversedNumber) ? false : isPalindrome;
        System.out.printf("%d - %s с %s (%d) количеством двоек %n",
                reversedNumber,
                (isPalindrome ? "палиндром" : "не палиндром"),
                ((twosCount % 2.0 == 0) ? "четным" : "нечетным"),
                twosCount);
    
        System.out.println("\n\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА\n");
        originalNumber = 101002;
        int leftHalf = originalNumber / 1000;
        int rightHalf = originalNumber % 1000;
        int leftSum = leftHalf % 10;
        int rightSum = rightHalf % 10;
        while (leftHalf > 0) {
            leftHalf /= 10;
            rightHalf /= 10;
            leftSum += leftHalf % 10;
            rightSum += rightHalf % 10;
        }
        System.out.printf("""
                %d - %s число
                Сумма цифр %03d = %d
                Сумма цифр %03d = %d
                """, originalNumber, (leftSum == rightSum) ? "счастливое" : "не счастливое",
                originalNumber / 1000, leftSum, originalNumber % 1000, rightSum);

        System.out.println("\n\n8. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ\n");
        String password = "";
        String passwordSecurity;
        boolean hasSpecialCharacters = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (int i = 1; i <= 8; i++) {
            char character = (char) new Random().nextInt(33, 126);
            password += character;
            if (character > 96 && character < 123) {
                hasLowerCase = true;
            } else if (character > 64 && character < 91) {
                hasUpperCase = true;
            } else if (character > 47 && character < 58) {
                hasDigit = true;
            } else {
                hasSpecialCharacters = true;
            }
        }
        if (password.length() >= 8 && hasLowerCase && hasUpperCase && hasSpecialCharacters) {
            passwordSecurity = "надежный";
        } else if (password.length() >= 8 && (hasUpperCase | hasDigit)) {
            passwordSecurity = "средний";
        } else {
            passwordSecurity = "слабый";
        }
        System.out.println("Пароль: " + password + "\nНадежность: " + passwordSecurity);
    }
}