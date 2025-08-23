import java.lang.System;
import java .util.Scanner;
class grocery
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the number of grocery you need to purchase:");
        int n=scan.nextInt();
        scan.nextLine();
        int t[]=new int[n];
        String name[]=new String[n];
        int p[]=new int[n];
        int q[]=new int [n];
        for(int i=0;i<n;i++)
        {
            int totali;
            System.out.println("Enter the details of grocery "+(i+1)+" :");
            System.out.println("Enter the name of the item ");
            name[i]=scan.nextLine();
            System.out.println("Enter the price of one item you going to buy:");
            p[i]=scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the quantity of this item you need to purchase:");
            q[i]=scan.nextInt();
            scan.nextLine();
            totali=p[i]*q[i];
            if(totali>=2000)
            {
                totali=(totali*5)/100;
                q[i]=q[i]-1;
                t[i]=totali;
            }
            else
            {
            t[i]=totali;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The details of the item "+(i+1)+" is");
            System.out.println("Name           :"+name[i]);
            System.out.println("Price per Item :"+p[i]);
            System.out.println("No.of.Quantity :"+q[i]);
            System.out.println("Total          :"+t[i]);
            if((q[i] & 1)==1)
            {
                System.out.println("The quantity of this item is odd ");
            }
            else
            {
                System.out.println("The quantity of this item is even ");
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(t[i]);
        }
        int min=t[0];
        String l=new String();
        for(int i=0;i<n;i++)
        {
            if(t[i]<min)
            {
                min=t[i];
                l=name[i];
            }
        }
        System.out.println("low value of item "+l+" "+min);
        int max=t[0];
        String k=new String();
        for(int i=0;i<n;i++)
        {
            if(t[i]>max)
            {
                max=t[i];
                k=name[i];
            }
        }
        System.out.println("high value of item "+k+" "+max);

    }
}