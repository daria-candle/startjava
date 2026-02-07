import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int hiddenNumber = new Random().nextInt(a, b);
        boolean isWin = false;
        do {
            int checkNumber = (a != b) ? new Random().nextInt(a, b + 1) : a;
            if (checkNumber > hiddenNumber) {
                System.out.println(checkNumber + " больше того, что загадал компьютер");
                b = checkNumber - 1;
            } else if (checkNumber < hiddenNumber) {
                System.out.println(checkNumber + " меньше того, что загадал компьютер");
                a = checkNumber + 1;
            } else {
                System.out.println(checkNumber + " - число угадано! Вы победили!");
                isWin = true;
            }
        } while (!isWin);
    }
}