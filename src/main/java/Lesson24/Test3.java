package Lesson24;

public class Test3 {
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

class Teacher extends Employee implements Help_able {
    int numberOfStudents;

    @Override
    public void pomosh() {
        System.out.println("Teacher helping someone");

    }

    @Override
    public void tushitPjar() {
        System.out.println("The teacher puts out the fire ");

    }

    void teach() {
        System.out.println("teach");
    }
}

class Driver extends Employee implements Help_able,Swim_able {
    String modelOfCar;

    void drive() {
        System.out.println("drive");
    }
    @Override
    public void pomosh() {
        System.out.println("drive helping someone");

    }

    @Override
    public void tushitPjar() {
        System.out.println("The drive puts out the fire ");

    }

    @Override
    public void swim() {
        System.out.println("The driver swims");
    }
}

interface Help_able {
    void pomosh();

    void tushitPjar();
}

interface Swim_able{
    void swim();
}
