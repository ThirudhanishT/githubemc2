import java.lang.System;
import java.util.*;
class Outer
{
    static int a;
    static int b;
    static int c;
    static int con;
    Scanner scan=new Scanner(System.in);
    void getdata()
    {
        a=scan.nextInt();
        scan.nextLine();
        b=scan.nextInt();
        scan.nextLine();
        c=scan.nextInt();
        scan.nextLine();
    }
    int check()
    {
        if(a==0)
        {
            System.out.println("IT IS NOT A QUADRATIC EQUATION");
            return 0;
        }
        else
        {
            con=(int)Math.sqrt((b*b)-(4*a*c));
            return 1;
        }
    }
    static class Inner
    {
        void cal()
        {
            if(con>0)
            {
                int r1=((-b)+con)/(2*a);
                int r2=((-b)-con)/(2*a);
                System.out.println("THE ROOT OF THE EQUATION "+"a"+"x^2"+"+"+"b"+"x"+"+"+"c "+r1 +"and " + r2);
            }
            else
            {
                int m=(-b)/(2*a);
                int n=(con)/(2*a);
                int r1=m+n;
                int r2=m-n;
                System.out.println("THE ROOT OF THE EQUATION "+"a"+"x^2"+"+"+"b"+"x"+"+"+"c "+r1 +"and " + r2);
            }
        }
    }
}
class quadratic
{
    public static void main(String []args)
    {
    Outer o=new Outer();
    int p;
    o.getdata();
    p=o.check();
    if(p==1)
    {
        Outer.Inner inn=new Outer.Inner();
        inn.cal();
    }
    }
}