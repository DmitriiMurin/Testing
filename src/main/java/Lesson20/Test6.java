package Lesson20;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        StringBuilder[]array2 = list1.toArray(new StringBuilder[2]);
        for (StringBuilder sb :
                array2) {
            System.out.println(sb);
        }
        }

    }

