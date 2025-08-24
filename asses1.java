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
            switch(choice)
            {
                case 1:System.out.println("Enter the password");
                       String pass=scan.nextLine();
                       if(pass.length()<=7 && pass.matches(".*[A-Z].*") && pass.matches(".*[a-z].*"))
                       {
                         System.out.println("THE PASSWORD IS VALID");
                       }
                       else
                       {
                        System.out.println("THE PASSWORD IS INVALID");
                       }
                       break;
                case 5:System.out.println("EXITED SUCCESSFULLY");
                       return;
            }
         }
    }

}