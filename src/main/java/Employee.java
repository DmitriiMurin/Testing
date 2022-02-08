public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id,String surname, int age, double salary, String department){
        this.id=id;
        this.surname=surname;
        this.age=age;
        this.salary = salary;
        this.department = department;
    }

    double balanceUp(){
        salary *=2;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
