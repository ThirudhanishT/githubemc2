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
        if(temp==num1 && temp%2!=0)
        {
            System.out.println("IT IS A PRIME PALINDROME");
        }
        else
        {
            System.out.println("not");
        }
    }
}