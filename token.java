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
}
class token
{
    public static void main(String []args)
    {
        System.out.println("Enter the number of employee");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        outer []o=new outer[n];
        int []t=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the token of employee"+" "+(i+1));
            o[i]=new outer();
            t[i]=o[i].getdata();
        }
        for(int i=0;i<n;i++)
        {
           System.out.println("Token for Employee"+" "+i+"is "+t[i] );
        }
    }
}