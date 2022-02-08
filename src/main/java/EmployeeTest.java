public class EmployeeTest {

    public static void main(String[] args) {

    Employee employee1 = new Employee(1,"Murin",36,150,"FS");
    Employee employee2 = new Employee(2,"Bobyr",32,90,"MS");
        System.out.println(employee1);
        System.out.println(employee2);
    employee1.balanceUp();
    employee2.balanceUp();
        System.out.println(employee1);
        System.out.println(employee2);

    }
}