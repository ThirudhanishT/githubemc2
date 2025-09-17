import java.lang.System;
import java.util.Scanner;
import mypackage1.book;
class package2
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        String name=scan.nextLine();
        System.out.println("Enter the author name: ");
        String auth=scan.nectLine();
        System.out.println("Enter the price of the book: ");
        double p=scan.nextDouble();
        System.out.println("Enter the publisher name: ");
        String pu=scan.nextLine();
        book b=new book()
        b.showTitle(name);
        b.showAuthor(auth);
        b.showPrice(p);
        b.showPublisher(pu);
    }
}