package oops.encapsulation;

public class BankImpl {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount(987654321, 12000);
        System.out.println(ac1.getBalance());
        System.out.println(ac1.getAccountNumber());
        ac1.deposit(200);
        System.out.println(ac1.getBalance());
        ac1.withdrawal(100);
        System.out.println(ac1.getBalance());
        ac1.withdrawal(30000);
        System.out.println(ac1.getBalance());
        ac1.deposit(-3);


    }
}
