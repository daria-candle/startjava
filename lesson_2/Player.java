public class Player {
    private String name;
    private int number;

    public Player(String name) {
        if (name.isEmpty()) {
            System.out.println("Имя игрока не должно быть пустым");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if (number < 1 || number > 100) {
            System.out.println("В игре разрешен ввод чисел в отрезке [1, 100]");
        } else {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }
}