package Lesson22;

import javax.print.Doc;

public class Test3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.specialization = "surgeon";
        doc.eat();
        doc.sleep();
        doc.treat();
    }
}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Doctor extends Employee {
    String specialization;

    void treat() {
        System.out.println("Treat");
    }
}

class Teacher extends Employee {
    int numberOfStudents;

    void teach() {
        System.out.println("teach");
    }

}

class Driver extends Employee {
    String modelOfCar;

    void drive() {
        System.out.println("drive");
    }

}