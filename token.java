import java.lang.System;
import java.util.Scanner;
class outer
{
    int empId;
    int rem;
    int temp=0;
    int getdata()
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of the working hours:");
    int hr;
    hr=scan.nextInt();
    empId=scan.nextInt();
    int i=1;
    while(i<=3)
    {
        rem=empId%10;
        empId=empId/10;
        temp=(temp*10)+rem;
        i++;
    }
    int oempId=temp;
    int rem1;
    int temp1=0;
    while(oempId!=0)
    {
        rem1=oempId%10;
        oempId=oempId/10;
        temp1=(temp1*10)+rem1;
    }
    int id=temp1;
    return id;
    }
   class inner
    {
        int cont_hr=45;
        int calext()
        {
            if(hr<=45)
               return 0;
            if(hr>45)
            {
                int l=cont_hr-hr;
                return l;
            }
        }
    }
}
class token
{
    public static void main(String []args)
    {
        System.out.println("Enter the number of employee");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        outer []o=new outer[n];
        outer.inner[]in=o.new inner[n];
        int []t=new int[n];
        int []h=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the token of employee"+" "+(i+1));
            o[i]=new outer();
            t[i]=o[i].getdata();
            h[i]=in.calext();
        }
        for(int i=0;i<n;i++)
        {
           System.out.println("Token for Employee"+" "+(i+1)+"is "+t[i]+"   "+"Extra hours: "+h[i] );
        }
    }
}