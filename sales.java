import java.lang.System;
import java.util.*;
class sales
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int []a=new int [3][];
        a[0]=new int [12];
        a[1]=new int [12];
        a[2]=new int [12];
        int []total=new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the 12 months scales for the store "+(i+1));
            int t=0;
            for(int j=0;i<a[i].length;i++)
            {
                 int y;
                 y=scan.nextInt();
                 scan.nextLine();
                 t=t+y;
            }
            total[i]=t;
        }
    }
}

