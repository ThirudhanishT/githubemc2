import java.lang.System;
import java.util.*;
class outer
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
    void check()
    {
        if(a==0)
        {
            System.out.println("IT IS NOT A QUADRATIC EQUATION");
        }
        else
        {
            con=(int)Math.sqrt((b*b)-(4*a*c));
        }
    }
    class inner
    {
        void cal()
        {
            if(con>0)
            {
                int r1=((-b)+con)/(2*a);
                int r2=((-b)-con)/(2*a);
                System.out.println("THE ROOT OF THE EQUATION "+"a"+"x^2"+"+"+"b"+"x"+"+"+"c "+r1 +"and " + r2);
            }
        }
    }
}