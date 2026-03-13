import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            String playerName1 = " ";
            String playerName2 = " ";
            try {
                System.out.print("Введите имя первого игрока: ");
                playerName1 = scanner.next();
                System.out.print("Введите имя второго игрока: ");
                playerName2 = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: " + e.getMessage());
                scanner.nextLine(); 
            }
            GuessNumber guessNumber = new GuessNumber(playerName1, playerName2, scanner);
            guessNumber.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
        scanner.close();
    }
}