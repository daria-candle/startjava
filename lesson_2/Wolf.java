public class Wolf {
    private char gender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == ' ') {
            System.out.println("Пустое значение");
        } else {
            this.gender = gender;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "") {
            System.out.println("Пустое значение");
        } else {
            this.name = name;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight == 0.0) {
            System.out.println("Нулевое значение");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == 0) {
            System.out.println("Нулевое значение");
        } else if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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