package Lesson9;

public class Car {

    int z = 5;

    String color;
    String engine;
    static int count;

    public Car(String color2, String engine2) {


        count++;
        color = color2;
        engine = engine2;
    }

    void changeColor(String color){
        color = color;

    }

    public static void main(String[] args) {
        Car c = new Car("Red", "V6");
        System.out.println(c.color);
        c.changeColor("Black");
        System.out.println(c.color);

    }
}
