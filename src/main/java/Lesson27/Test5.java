package Lesson27;

public class Test5 {
    static void abc (){
        System.out.println("Vizov abc");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
