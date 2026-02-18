import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        int leftNumber = 1;
        int rightNumber = 100;
        int hiddenNumber = new Random().nextInt(leftNumber, rightNumber + 1);
        Random random = new Random();
        int playerNumber;
        do {
            playerNumber = random.nextInt(leftNumber, rightNumber + 1);
            if (playerNumber > hiddenNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
                rightNumber = playerNumber - 1;
            } else if (playerNumber < hiddenNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
                leftNumber = playerNumber + 1;
            } else {
                break;
            }
        } while (true);
        System.out.println(playerNumber + " - число угадано! Вы победили!");
    }
}