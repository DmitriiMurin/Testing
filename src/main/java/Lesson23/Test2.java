package Lesson23;


import Lesson14.Test6;

public class Test2 {

    public Object abc(){return new StringBuilder("abra");

    }
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();

        Employee emp1 = new Doctor();

        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();



        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();


    }
}
//    class Employee {
//        double salary = 100;
//        String name;
//        int age;
//        int experience;
//
//        void eat() {
//            System.out.println("Eating");
//        }
//
//        void sleep() {
//            System.out.println("Sleeping");
//        }
//    }

    class Doctor extends Employee {
        String specialization;

        void treat() {
            System.out.println("Treat");
        }
    }

//    class Teacher extends Employee {
//        int numberOfStudents;
//
//        void teach() {
//            System.out.println("teach");
//        }
//
//    }

    class Driver extends Employee {
        String modelOfCar;

        void drive() {
            System.out.println("drive");
        }
}
