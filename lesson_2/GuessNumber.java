import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private Player player1;
    private Player player2;
    private Scanner scanner;

    public GuessNumber(String name1, String name2, Scanner scanner) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        this.scanner = scanner;
    }

    public void play() {
        System.out.println("Игра началась!");
        int minNumber = 1;
        int maxNumber = 100;
        hiddenNumber = new Random().nextInt(minNumber, maxNumber + 1);
        while (true) {
            inputNumber(player1);
            if (isWinnerFound(player1)) {
                outputWinner(player1);
                break;
            }
            inputNumber(player2);
            if (isWinnerFound(player2)) {
                outputWinner(player2);
                break;
            }
        }
    }

    private void inputNumber(Player player) {
        try {
            System.out.print(player.getName() + ", ведите число: ");
            player.setNumber(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: " + e.getMessage());
            scanner.nextLine(); 
        }
    }

    private boolean isWinnerFound(Player player) {
        int playerNumber = player.getNumber();
        if (playerNumber > hiddenNumber) {
            System.out.println(playerNumber + " больше того, что загадал компьютер");
            return false;
        } else if (playerNumber < hiddenNumber) {
            System.out.println(playerNumber + " меньше того, что загадал компьютер");
            return false;
        } else {
            return true;
        }
    }

    private void outputWinner(Player player) {
        System.out.println(player.getNumber() + " - число угадано! " + player.getName() + " победил!");
    }
}