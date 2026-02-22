public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = 'м';
        wolf.name = "Акела";
        wolf.weight = 43.2f;
        wolf.age = 10;
        wolf.color = "серый";
        System.out.println("пол: " + wolf.gender);
        System.out.println("кличка: " + wolf.name);
        System.out.println("вес: " + wolf.weight);
        System.out.println("возраст: " + wolf.age);
        System.out.println("окрас: " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}