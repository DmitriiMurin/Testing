package Lesson11;

public class CarTest {

    public static void doorsChange(Car c, int a) {
        c.doors = a;
    }

    public static void changeCarColor(Car f, Car g) {
        String s = f.color;
        f.color = g.color;
        g.color = s;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Red", "V6", 5);
        Car c2 = new Car("Black", "V8", 3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();
        doorsChange(c1, 2);
        changeCarColor(c1, c2);
        System.out.println(c1);
        System.out.println(c2);

    }
}
