import javax.swing.*;

public class TEST {

    public static void main(String[] args) {

    Human h = new Human();
    h.name = "David";
    h.car= new Car3("RED", "V8");
    h.ba = new BankAccount(18, 200.5);
    h.info();



    }

    static class Car3{

        Car3(String c, String e){
            color=c;
            engine=e;
        }
        String color;
        String engine;
    }

    static class BankAccount{
        int id;
        double balance;

        BankAccount (int id2, double balance2){
            id=id2;
            balance=balance2;
        }
    }

    static class Human{
        String name;
        Car3 car;
        BankAccount ba;
        void info(){
            System.out.println("имя: " +name + " цвет машины " + car.color + " баланс счета " + ba.balance);

        }

    }




}



