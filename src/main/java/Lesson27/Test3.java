package Lesson27;

import java.io.*;

public class Test3 {

    void abc() throws FileNotFoundException {
        File f = new File("test1.txt");
//        try{
        FileInputStream fis = new FileInputStream(f);
        System.out.println("HAVE A NICE DAY, EVERYONE");
    }
//        catch (FileNotFoundException e){
//            System.out.println("We caught the Exception: "+e);
//        }
//    }

    void def() throws FileNotFoundException {
        System.out.println("Privet");
        abc();
    }
            public static void main (String[]args){
Test3 t = new Test3();
try {
    t.def();
} catch (FileNotFoundException e){
    System.out.println("We caught the Exception: " + e);
}

            }
}
