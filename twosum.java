import java.lang.System;
import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=scan.nextInt();
        scan.nextLine();
        System.out.println("enter the target :");
        int target=scan.nextInt();
        scan.nextLine();
        int [] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scan.nextInt();
            scan.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(nums[i]);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }

    }
}