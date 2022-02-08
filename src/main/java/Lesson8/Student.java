package Lesson8;

public class Student {
    String name;
    int course;
    static int count = 0;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }
    public static void showCount(){
        System.out.println("Vsego sozdano studentov: " + count);
    }
    public void showInfo(){
        System.out.println("Welcome to the student class!!!");
    }

    void abc(){
        a++;
        count++;
    }
    static void abcd(){
        count++;
    }
}

class StudentTest{
    public static void main(String[] args) {




    }
}
