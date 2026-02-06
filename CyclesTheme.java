import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ВЫВОД ASCII-СИМВОЛОВ\n");
        System.out.printf("%s%12s%14s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int asciiCode = 33; asciiCode <= 122; asciiCode += 2) {
            if (asciiCode <= 47 | asciiCode >= 98) {
                System.out.printf("%4d%11c%12s%-1s%n", asciiCode, asciiCode, "", 
                        Character.getName(asciiCode));
            }
        }

        System.out.println("\n\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");
        for (int row = 1; row <= 5; row++) {
            System.out.print("----------");
            System.out.print(" ");
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
        originalNumber = 2234321;
        int twosCount = 0;
        boolean isPalindrome = true;
        System.out.println("Исходное число: " + originalNumber);
        for (int divider = 1; divider <= 1000000; divider *= 10) {
            int rightNumber = originalNumber % (divider * 10) / divider;
            int leftNumber = originalNumber % (10000000 / divider) / (1000000 / divider);
            System.out.print(rightNumber);
            twosCount = (rightNumber == 2) ? twosCount + 1 : twosCount;
            isPalindrome = (rightNumber != leftNumber) ? false : isPalindrome;
        }
        System.out.printf(" - %s с %s (%d) количеством двоек %n", 
                (isPalindrome ? "палиндром" : "не палиндром"),
                ((twosCount % 2.0 == 0) ? "четным" : "нечетным"),
                twosCount);
    
        System.out.println("\n\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА\n");
        originalNumber = 101002;
        int leftNumber = originalNumber / 1000;
        int rightNumber = originalNumber % 1000;
        int leftSum = 0;
        int rightSum = 0;
        int divider = 1;
        do {
            leftSum = leftSum + (leftNumber % (divider * 10) / divider);
            rightSum = rightSum + (rightNumber % (divider * 10) / divider);
            divider *= 10;
        } while (divider <= 100);
        System.out.printf("""
                %d - %s число
                Сумма цифр %03d = %d
                Сумма цифр %03d = %d
                """, originalNumber, (leftSum == rightSum) ? "счастливое" : "не счастливое",
                leftNumber, leftSum, rightNumber, rightSum);

        System.out.println("\n\n8. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ\n");
        String password = "";
        String passwordSecurity;
        boolean hasSpecialCharacters = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (int i = 1; i <= 8; i++) {
            char character = (char) new Random().nextInt(33, 126);
            password = password + character;
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