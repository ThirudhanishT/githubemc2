import java.lang.System;
import java.util.*;
class asses1
{
    public static void main(String args[])
    {
         System.out.println("--MENU--");
         System.out.println("1.To check password");
         System.out.println("2.To heck factorial");
         System.out.println("3.To addition of two matrics");
         System.out.println("4.TO substract of two matrics");
         System.out.println("5.TO exist");
         while(true)
         {
            System.out.println("Enter your opinion");
            Scanner scan=new Scanner (System.in);
            int choice=scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 1:System.out.println("Enter the password");
                       String pass=scan.nextLine();
                       if(pass.length()>=7 && pass.matches(".*[A-Z].*") && pass.matches(".*[a-z].*"))
                       {
                         System.out.println("THE PASSWORD IS VALID");
                       }
                       else
                       {
                        System.out.println("THE PASSWORD IS INVALID");
                       }
                       break;
                case 2:System.out.println("Enter the number ");
                       int n;
                       n=scan.nextInt();
                       int fact=1;
                       for(int i=1;i<=n;i++)
                       {
                             fact=fact*i;
                       }
                       System.out.println("THE FACTORIAL OF THE NUMBER IS "+fact);
                       break;
                case 3:System.out.println("Enter the row size of the array");
                       int k;
                       k=scan.nextInt();
                       System.out.println("Enter the coloumn size of the array");
                       int r;
                       r=scan.nextInt();
                       System.out.println("Enter the arr 1");
                       int [][]arr1=new int[k][r];
                       int [][]arr2=new int [k][r];
                       int [][]c=new int [k][r];
                       for(int i=0;i<k;i++)
                       {
                        for(int j=0;j<r;j++)
                        {
                          arr1[i][j]=scan.nextInt();
                          scan.nextLine();
                        }
                       }
                       System.out.println("Enter the arr2");
                       for(int i=0;i<k;i++)
                       {
                        for(int j=0;j<r;j++)
                        {
                          arr2[i][j]=scan.nextInt();
                          scan.nextLine();
                        }
                       }
                       for(int i=0;i<k;i++)
                       {
                        for(int j=0;j<r;j++)
                        {
                          c[i][j]=arr1[i][j]+arr2[i][j];
                        }
                       }
                       System.out.println("THE ADDITION OF THE ARRAY IS");
                       for(int i=0;i<k;i++)
                       {
                        for(int j=0;j<r;j++)
                        {
                          System.out.print(c[i][j]);
                        }
                        System.out.print("\n");
                       }
                       break;
                case 4:System.out.println("Enter the row size of the array");
                       int k1;
                       k1=scan.nextInt();
                       System.out.println("Enter the coloumn size of the array");
                       int r1;
                       r1=scan.nextInt();
                       System.out.println("Enter the arr 1");
                       int [][]arr11=new int[k1][r1];
                       int [][]arr21=new int [k1][r1];
                       int [][]c1=new int [k1][r1];
                       for(int i=0;i<k1;i++)
                       {
                        for(int j=0;j<r1;j++)
                        {
                          arr11[i][j]=scan.nextInt();
                          scan.nextLine();
                        }
                       }
                       System.out.println("Enter the arr2");
                       for(int i=0;i<k1;i++)
                       {
                        for(int j=0;j<r1;j++)
                        {
                          arr21[i][j]=scan.nextInt();
                          scan.nextLine();
                        }
                       }
                       for(int i=0;i<k1;i++)
                       {
                        for(int j=0;j<r1;j++)
                        {
                          c1[i][j]=arr11[i][j]+arr21[i][j];
                        }
                       }
                       System.out.println("THE ADDITION OF THE ARRAY IS");
                       for(int i=0;i<k1;i++)
                       {
                        for(int j=0;j<r1;j++)
                        {
                          System.out.print(c1[i][j]);
                        }
                        System.out.print("\n");
                       }
                       break;               
                case 5:System.out.println("EXITED SUCCESSFULLY");
                       return;
            }
         }
    }

}