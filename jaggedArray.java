import java.lang.System;
import java.util.*;
class jaggedArray
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of the customer");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        int [][]customer=new int [n][];
        System.out.println("Enter the product list available in the department store");
        ArrayList<String>product=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            String c=scan.nextLine();
            product.add(c);
        }
        System.out.println("THE PRODUCTS:");
        System.out.println(product);
    }
}