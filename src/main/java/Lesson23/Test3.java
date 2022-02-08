package Lesson23;

public class Test3 {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.eat();
        Teacher t = new Teacher();
        t.eat();
    }
}


class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Employee is eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Teacher extends Employee {
    int numberOfStudents;

    void teach() {
        System.out.println("teach");
    }
    void eat() {
        System.out.println("Teacher is eating");
    }


}
