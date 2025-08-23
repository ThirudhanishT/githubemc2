import java.lang.System;
import java.util.Scanner;
class currency
{
    public static void main(String args[])
    {
        System.out.println("Thirudhanish.T");
        System.out.println("2024503054");
        int count=0;
        Scanner scan=new Scanner (System.in);
        System.out.println("enter the amount :");
        int amount=scan.nextInt();
        int[] note={2000,500,100,50,20,10,5,2};
        int l= note.length;
        System.out.println("array length "+ l);
        for(int i=0;i<l;i++)
        {
              if(amount>=note[i])
              {
              count=amount/note[i];
              amount=amount%note[i];
              System.out.println("the note :"+note[i] + "count is: "+count);
              }
              
        }
        if(amount>0)
        {
            System.out.println("the remaining amount is :"+ amount);
        }
    }
}