


public class BankAccount {

    int id;
    String name;
    double balance;
    double popolnenieScheta(double b1){
        balance += b1;
        return balance;
    }

    double snyatieSoScheta(double b2){
        balance -= b2;
        return balance;

    }

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1,"Dima",150);
        System.out.println(account1);
        account1.popolnenieScheta(51);
        System.out.println(account1);
        account1.snyatieSoScheta(52);
        System.out.println(account1);
        System.out.println(account1.balance);

    }
}


