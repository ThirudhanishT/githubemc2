import java.lang.System;
import java.util.Scanner;
class outer
{
    int empId;
    int rem;
    int temp=0;
    int hr;
    Scanner scan=new Scanner(System.in);
    int gete()
    {
       System.out.println("Enter the employee id no:");
       empId=scan.nextInt();
       return empId; 
    }
    int getdata()
    {
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
    int gethr()
    {
    System.out.println("Enter the number of the working hours:");
    hr=scan.nextInt();
    return hr;
    }
   class inner
    {
        int cont_hr=9;
        int calext()
        {
            if(hr>9)
            {
                int hr1;
                System.out.println("Invalid");
                System.out.println("Enter the valid hr must be less then 9");
                hr1=gethr();
                return hr;
            }
            return hr;
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
        outer.inner[] in=new outer.inner[n];
        int []t=new int[n];
        int []h=new int[n];
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the empId of employee"+" "+(i+1));
            o[i]=new outer();
            a[i]=o[i].gete();
            t[i]=o[i].getdata();
            o[i].gethr();
            in[i]=o[i].new inner(); 
            h[i]=in[i].calext();
        }
        for(int i=0;i<n;i++)
        {
           System.out.println("Token for Employee"+" "+(i+1)+" : "+"Token: "+t[i]+h[i]+"  "+" ID: "+a[i]+"  last3empID: "+t[i]+"   "+"Extra hours: "+h[i]);
        }
    }
}