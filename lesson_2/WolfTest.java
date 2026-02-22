public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.set_gender('м');
        wolf.set_name("Акела");
        wolf.set_weight(43.2f);
        wolf.set_age(10);
        wolf.set_color("серый");
        System.out.println("пол: " + wolf.get_gender());
        System.out.println("кличка: " + wolf.get_name());
        System.out.println("вес: " + wolf.get_weight());
        System.out.println("возраст: " + wolf.get_age());
        System.out.println("окрас: " + wolf.get_color());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}