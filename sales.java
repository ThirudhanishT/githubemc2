import java.lang.System;
import java.util.*;
class sales
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int [][]a=new int [3][];
        a[0]=new int [12];
        a[1]=new int [12];
        a[2]=new int [12];
        int []total=new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the 12 months scales for the store "+(i+1));
            int t=0;
            for(int j=0;j<a[i].length;j++)
            {
                 a[i][j]=scan.nextInt();
                 t=a[i][j]+t;
            }
            total[i]=t;
        }
        int z=0;
        int max;
        max=a[2][0];
        System.out.println(Arrays.toString(total));
            for(int j=0;j<a[2].length;j++)
            {
                  if(a[2][j]>max)
                  {
                     max=a[2][j];
                     z=j;
                  }
            }
            System.out.println("MAXIMUM SALES FOR THIRD STORE IS IN THE MONTH :"+(z+1));
        
    }
}

