package Lesson7;

 public class Emloyee {

     protected double salary;

     protected void dvoinayaZp(){
        System.out.println(salary*2);
    }

     protected Emloyee(double salary2){
        salary= salary2;
    }

    public static void main(String[] args) {
        Emloyee emp = new Emloyee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZp();
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Emloyee emp = new Emloyee(600);
        System.out.println(emp.salary);
        emp.dvoinayaZp();
    }
}
