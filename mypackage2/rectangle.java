package mypackage2;
public class rectangle
{
    double length;
    double breadth;
    double arear;
    double peri;
    public void getr(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void calA()
    {
        arear=length*breadth;
        System.out.println("The area of the rectangle is :"+arear );
    }
    public void calperir()
    {
        peri=2*length*breadth;
        System.out.println("The perimeter of the rectangle is :"+peri);
    }
}