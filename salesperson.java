import java.lang.System;
import java.util.*;
class sales
{
    int age;
    String name;
    int no_sales;
    double salary;
    sales(int a,String b,double c)
    {
        age=a;
        name=b;
        n0_sales=0;
        salary=c;
    }
    void addScale(double saleAmount)
    {
        no_sales=no_sales+1;
    }
    int getsales()
    {
        return no_sales;
    }
    void display()
    {
        System.out.println("NAME:  "+name);
        System.out.println("AGE:   "+age);
        System.out.println("SALARY: "+salary);
    }
    double getbonus()
    {
        if(no_sales>10 && no_sales<20)
        {
            b=1000;
            return b;
        }
        if(no_sales>20 && no_sales<40)
        {
            b=2000;
            return b;
        }
        if(no_sales>40)
        {
            b=5000;
            return b;
        }
    }
}
class salesperson
{
    public static void main(String args)
    {
        sales s=new sales();
        s.display();
        System.out.println("NO_SALES:"+s.getsales());
        System.out.println("BONUS :"+s.getbonus());
    }
}