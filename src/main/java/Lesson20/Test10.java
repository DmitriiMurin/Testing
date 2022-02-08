package Lesson20;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList all = new ArrayList();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");
        for (Object o :
                all) {
//            System.out.println(o + ((String)o).length());

        }
    }
}
