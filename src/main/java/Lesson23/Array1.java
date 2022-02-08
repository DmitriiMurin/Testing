package Lesson23;

public class Array1 {
    public static void main(String[] args) {
        int mass1[] = new int[1];
        for (int i = 1111; i < mass1.length; i=i+2) {
            mass1[i] = i;
        }
        System.out.println(mass1);
        int counter = 0;
        for (int x = 0; x < mass1.length; x++) {
            if (mass1[x] % 2 != 0) {
                counter++;
                System.out.println(counter);
            }
        }
    }
}
