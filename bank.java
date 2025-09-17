import java.lang.System;
import java.util.Scanner;
interface Account
{
	void deposit(double amount);
        void withdraw(double amount);
        /*static policy()
        {
           System.out.println("MINIMUM BALANCE FOR SAVING IS 1000");
           System.out.println("OVERDRAFT LIMIT FOR CURRENT ACCOUNT IS 15000");
        }*/
}
class SavingAccount implements Account
{
	double balance;
	double rb;
        double damount;
	void getbalance(double balance)
        {
  		this.balance=balance;
        }
        public void deposit(double amount)
        {
                 damount=amount;
                 if(damount<=15000)
                 {
                    balance +=damount;
                 }
                 if(damount>15000 || damount==0)
                 {
                    System.out.println("Your deposit amount is over than the bank limit (or) your deposit amount is zero");       
                 }
        }  
        public void withdraw(double amount)
        {
                if(amount<=15000)
                {
      		    rb=balance-amount;
		    if(rb>=1000)
                    {
			System.out.println("Proceeding withdraw process ");
		        System.out.println("Remaining balance: "+rb);
                    }
                    else
                    {
                        System.out.println("Failed to withdraw");
                        System.out.println("Your balance is insufficient ");
                        System.out.println("Please maintain the minimum balance of 1000");
                    }
                }
                else
                {
                        System.out.println("You cannot withdraw more than 15000");
                }
        }
}
class CurrentAccount extends SavingAccount implements Account
{
         void getbalance(double amount)
         {
              double c=amount;
              super.getbalance(c);
         }
         public void deposit(double amount)
         {
              double a=amount;
              super.deposit(a);
         }
         public void withdraw(double amount)
         {
              double b=amount;
              super.withdraw(b);
         }
}
class bank
{
	public static void main(String args[])
        {
                System.out.println("Enter the CHOICE");
                System.out.println("1.To Saving Account");
                System.out.println("2.TO Currentamount");
                System.out.println("3.To exit");
                while(true)
                {
                System.out.println("Enter the option: ");
                int option;
                Scanner scan=new Scanner(System.in);  
        	SavingAccount s=new SavingAccount();
                option=scan.nextInt();
                switch(option)
                {
                case 1:double t;
                       System.out.println("Enter the initial balance amount: ");
               	       t=scan.nextDouble();
                       s.getbalance(t);
                       System.out.println("Enter the amount to deposit:");
                       double m=scan.nextDouble();
                       s.deposit(m);
                       System.out.println("Enter the amount to withdraw:");
                       double n=scan.nextDouble();
                       s.withdraw(n);
                       break;

                case 2:CurrentAccount c=new CurrentAccount();
                       System.out.println("Enter the initial balance amount: ");
                       double t1=scan.nextDouble();
                       c.getbalance(t1);
                       System.out.println("Enter the amount to deposit:");
                       double m1=scan.nextDouble();
                       c.deposit(m1);
                       System.out.println("Enter the amount to withdraw:");
                       double n1=scan.nextDouble();
                       c.withdraw(n1);
                       break;
              
               case 3: return;

               default:System.out.println("INVALID ENTRY");
          }
        }
        }
}