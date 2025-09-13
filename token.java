import java.lang.System;
import java.util.Scanner;
class outer
{
    int empId;
    int rem;
    int temp=0;
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
    System.out.println(id);
}