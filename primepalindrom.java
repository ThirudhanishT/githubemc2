import java.lang.System;
import java.util.*;
class primepalindrom
{
    public static void main(String args[])
    {
        int num=2;
        int num1=num;
        int rem;
        int temp=0;
        int count=0;
        int n=0;
        while(n<20)
        {
            while(num!=0)
            {
            rem=num%10;
            num=num/10;
            temp=(temp*10)+rem;
            }
            for(int j=2;j<=temp;j++)
            {
            if(temp%j==0)
            {
                count=count+1;
                n=n+1;
            }
            else 
            {
                num=num+1;
            }
            }
        }
        /*if(temp==num1 && count==2)
        {
            System.out.println("IT IS A PRIME PALINDROME");
        }
        else
        {
            System.out.println("not");
        }*/
    }
}