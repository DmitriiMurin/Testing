package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("ByeBye"));
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Hi"));
        for (StringBuilder s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(list.get(1));

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));
        list.addAll(list2);
        for (StringBuilder s1 :
                list) {
            System.out.print(s1);}
            list2.get(1).append("!");
            for (StringBuilder s2 :
                    list) {
                System.out.print(s2);
        }
        System.out.print("");
        System.out.print("");
            list.clear();
            for (StringBuilder s2 :
                    list) {
                System.out.println(s2);
    }
}}
