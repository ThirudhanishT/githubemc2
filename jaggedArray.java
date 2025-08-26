import java.lang.System;
import java.util.*;
class jaggedArray
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the product list available in the department store");
        ArrayList<String>product=new ArrayList<>();
        ArrayList<Double>cost=new ArrayList<>();
        System.out.println("Enter the number of products available in the store");
        int h;
        h=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<h;i++)
        {
            System.out.println("Enter the product: "+(i+1));
            String c=scan.nextLine();
            System.out.println("ENter the cost: "+(i+1));
            double d=scan.nextInt();
            scan.nextLine();
            cost.add(d);
            product.add(c);
        }
        System.out.println("Enter the number of the customer");
        int n=scan.nextInt();
        scan.nextLine();
        int [][]customer=new int [n][];
        double total[]=new double[n];
        System.out.println("Enter the details of the customers");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter how many products are purchased by customer: "+(i+1));
            int y=scan.nextInt();
            scan.nextLine();
            System.out.println("THE PRODUCTS:");
            System.out.println(product);
            System.out.println(cost);
            customer[i]=new int[y];
            double total1=0.0;
            for(int k=0;k<customer[i].length;k++)
            {
                int t;
                System.out.println("Enter the product"+(k+1));
                String name=scan.nextLine();
                t=product.indexOf(name);
                double r;
                r=cost.get(t);
                total1=total1+r;
            }
            total[i]=total1;
        }
        for(int i=0;i<customer.length;i++)
        {
                 System.out.println("THE CUSTOMER "+(i+1)+"  "+"NO OF PRODUCTS THE CUSTOMER BOUGHT: "+customer[i].length+"   "+"TOTAL: "+total[i]);
        }
    }
}