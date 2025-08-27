import java.lang.System;
import java.util.*;
class primepalindrom
{
    public static void main(String args[])
    {
        int num=2;
        int n=0;
        while(n<20)
        {
           int rem;
           int temp=0;
           int count=0;
           int num1=num;
           int copy =num; 
            while(copy!=0)
            {
            rem=copy%10;
            copy=copy/10;
            temp=(temp*10)+rem;
            }
            for(int j=1;j<=temp;j++)
            {
            if(temp%j==0)
            {
                count=count+1;
            }
            }
            if(temp==num1 && count==2)
            {
                System.out.println(temp);
                n=n+1;
            }
            num=num+1;
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