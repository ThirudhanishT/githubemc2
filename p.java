import java.lang.System;
import java.util.Scanner;
class BankAccount
{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    BankAccount(int accountNumber,String accountHolder,double balance)
    {
        accountNumber=this.accountNumber;
        accountHolder=this.accountHolder;
        balance=this.balance;
    }
    void deposit(double amount)
    {
        balance=balance+amount;
    }
    void withdraw(double amount)
    {
        balance=balance-amount;
    }
    double getBalance()
    {
        return balance;
    }
    void display()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balnace       : "+balance);
    }
}
class SavingAccount extends BankAccount
{
    double IR;
    double intrest;
    void intrestRate(double r)
    {
          IR=r;
    }
    void applyIntrest()
    {
           int c=super.getBalance();
           intrest=(c*IR)/(100.0);
    }
    void display()
    {
        super.display();
        System.out.println("Intrest  :intrest");
    }
    SavingAccount()
    {
        super(56324573,"Thiru",20000.0);
    }
}
class p
{
    public static void main(String [] args)
    {
        SavingAccount s=new SavingAccount();
        s.intrestRate(5.0);
        s.applyIntrest();
        s.display();
    }
}