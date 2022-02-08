package Lesson22;

public class People {
    final String sex;

    public People(String sex) {
        this.sex = sex;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int i) {
        if (i > 0) {
            weight = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        People c = new People("male");
        c.setName("Kolya");
        c.setWeight(50);
        c.setAge(15);
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getWeight());
    }
}
