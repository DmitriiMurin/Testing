package Lesson14;

public class Test6 {

    public static void time() {
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            INNER:
            for (int minute = 0; minute <= 59; minute++) {

                System.out.println(hour + ":" + minute);
                if (minute == 30) {
                    break OUTER;
                }
            }

        }
    }

    public static void main(String[] args) {

        Test6.time();

    }
}
