public class Player {
    private String name;
    private int number;

    public Player(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name == "") {
            System.out.println("Пустая строка");
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