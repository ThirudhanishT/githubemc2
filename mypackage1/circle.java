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