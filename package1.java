package mypackage1;
public class circle
{
    double radius;
    double area;
    double perimeter;
    void get(double radius)
    {
        this.radius=radius;
    }
    void calArea()
    {
        area=radius*radius;
        System.out.println("The area of the circle is: "+area);
    }
    void calPeri()
    {
        perimeter=(2.0)*(3.14)*radius;
        System.out.println("The perimeter of the circle is: "+perimeter);
    }
}

package mypackage2;
public class rectangle
{
    double length;
    double breadth;
    double arear;
    double peri;
    void getr(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void calA()
    {
        arear=length*breadth;
        System.out.println("The area of the rectangle is :"+arear );
    }
    void calperir()
    {
        peri=2*length*breadth;
        Ststem.out.println("The perimeter of the rectangle is :"+peri);
    }
}

import java.util.Scanner;
import mypackage.*;
class package1
{
    public static void main(String []args)
    {
       circle c=new circle();
       c.get(5.0);
       c.calArea();
       c.calPeri();
       rectangle r=new rectangle();
       r.getr(59.0,3.0);
       r.calA();
       r.calPerir(); 
    }
}