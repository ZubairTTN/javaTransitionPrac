package oops.encapsulation;

public class BankAccount {
    private final long accountNumber;
    private double balance;

//    Constructor
    public BankAccount(long accountNumber, int balance)
    {
        if(balance < 0)
        {
            this.balance = 0;
        }
        if(accountNumber <= 0)
        {
            throw new RuntimeException();
        }
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
//    Getter
    public long getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(int amount)
    {
        if(amount < 0)
        {
            System.out.println("Negative Amount deposit karoge kia, Invalid Deposit amount...");
        }
        balance+= amount;
    }

    public void withdrawal(int amount)
    {
        if(amount <= 0)
        {
            balance-= 0;
        }
        if (amount > balance)
        {
            System.out.println("Insufficient balance, Aukaat se zada amount is getting withdrawan....");
        }
        balance-= amount;
    }

}
