package mypackage1;
public class circle
{
    double radius;
    double area;
    double perimeter;
    public void get(double radius)
    {
        this.radius=radius;
    }
    public void calArea()
    {
        area=radius*radius;
        System.out.println("The area of the circle is: "+area);
    }
    public void calPeri()
    {
        perimeter=(2.0)*(3.14)*radius;
        System.out.println("The perimeter of the circle is: "+perimeter);
    }
}