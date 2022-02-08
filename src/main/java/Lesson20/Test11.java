package Lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mikhail");
        map.put(778, "Tregulov Zaur");
        map.put(779, "Sidorova MAriya");
        map.put(780, "Perov Petr");
        map.put(779, "Roberto");
        map.put(779, "Roberto");
        map.remove(779);

        System.out.println(map);
    }
}
