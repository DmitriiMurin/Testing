package Lesson23;
import java.util.*;

import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args) {
        int [] array1 = new int[10000];
        for(int i = 0; i< array1.length-1111; i=i+2){
            array1[i] = i+1111;
            System.out.println(array1[i]);
        }
        int count = 0;
        for(int x = 0; x< array1.length;x++){
            if(array1[x]%2 !=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
