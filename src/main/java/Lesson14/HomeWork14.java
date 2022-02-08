package Lesson14;

public class HomeWork14 {
    public static void time() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute <= 59; minute++) {
                if (minute % 10 == 0 && hour > 1) {
                    break OUTER;
                }
                INNER:
                for (int second = 0; second <= 59; second++) {
                    if (second * hour > minute) {
                        break INNER;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        HomeWork14.time();
    }
}
