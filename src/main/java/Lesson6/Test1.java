package Lesson6;

public class Test1 {
    public static void main(String[] args) {
        SummaNul summa1 = new SummaNul();
        summa1.summa();
    }
}

class SummaNul {
    void summa() {
        System.out.println(0);
    }

    void summa(int a) {
        System.out.println(a);
    }

    void summa(int a, int b) {
        System.out.println(a + b);
    }


    void summa(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void summa(int a, int b, int c, int d) {
        summa(a, b, c);
        System.out.println(a + b + c + d);
    }

    void summa(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }


}
