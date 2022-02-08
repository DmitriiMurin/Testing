package Lesson8;

public class Class1 {

    static int umnozhaet3chisla(int a,int b,int c){
        return a*b*c;
//        System.out.println("Умножили и полусили: "+ a*b*c);
    }

    static void delit2Chiclona1Chislo(int a,int b,double c){
        System.out.println("Поделили 1 число на 2 и получили:" + a/b +"," + a%b);
    }
}

class Class2{
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        System.out.println(c1.umnozhaet3chisla(3,4,5));
        c1.delit2Chiclona1Chislo(3,4,5);
        System.out.println(c1.umnozhaet3chisla(6,5,4));
        c1.delit2Chiclona1Chislo(6,9,5);

    }
}
