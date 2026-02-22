public class Wolf {
    private char gender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public char get_gender() {
        return gender;
    }

    public void set_gender(char gender) {
        if (gender == ' ') {
            System.out.println("Пустое значение");
        } else {
            this.gender = gender;
        }
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        if (name == "") {
            System.out.println("Пустое значение");
        } else {
            this.name = name;
        }
    }

    public float get_weight() {
        return weight;
    }

    public void set_weight(float weight) {
        if (weight == 0.0) {
            System.out.println("Нулевое значение");
        } else {
            this.weight = weight;
        }
    }

    public int get_age() {
        return age;
    }

    public void set_age(int age) {
        if (age == 0) {
            System.out.println("Нулевое значение");
        } else if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String get_color() {
        return color;
    }

    public void set_color(String color) {
        if (color == "") {
            System.out.println("Пустое значение");
        } else {
            this.color = color;
        }
    }

    public void go() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}