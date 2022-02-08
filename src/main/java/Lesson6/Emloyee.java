package Lesson6;

public class Emloyee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    Emloyee(int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }

    public Emloyee(String surname2, int age2) {
        surname = surname2;
        age = age2;
    }

    Emloyee(int id2, String surname2, int age2, double salary2, String department2) {

    }
}


class EmloyeeTest {
    public static void main(String[] args) {
        Emloyee emp1 = new Emloyee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Emloyee emp2 = new Emloyee("Petrov", 32);
        System.out.println(emp2.surname);
        Emloyee emp3 = new Emloyee(2,"Sidorov", 40,100.35,"IT");
        System.out.println(emp3.department);
    }
}
