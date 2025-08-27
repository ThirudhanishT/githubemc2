import java.lang.System;
import java.util.*;
class primepalindrom
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int num1=num;
        int rem;
        int temp=0;
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            temp=(temp*10)+rem;
        }
        int count=0;
        while(n<20)
        { for(int i=1;i<=temp;i++)
        {
            if(temp%i==0)
            {
                count=count+1;
            }
        }
        }
        if(temp==num1 && count==2)
        {
            System.out.println("IT IS A PRIME PALINDROME");
        }
        else
        {
            System.out.println("not");
        }
    }
}