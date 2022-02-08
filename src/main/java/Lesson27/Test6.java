package Lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("file test 10 not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file test 9 not found");

        } finally {
            System.out.println("This is OUTPUT finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Found exception in finally block");
            }
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.abc();
    }
}

