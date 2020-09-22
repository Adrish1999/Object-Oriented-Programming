import java.io.*;

abstract class Diagram 
{
    double dim1;
    double dim2;
    Diagram(double a, double b) 
    {
       dim1 = a;
       dim2 = b;
    }
       
    abstract double area();
 }
 class Rectangle extends Diagram 
 {
    Rectangle(double a, double b) 
    {
       super(a, b);
    }
    
    double area() 
    {
       return dim1 * dim2;
    }
 }
 class Triangle extends Diagram {
    Triangle(double a, double b) 
    {
       super(a, b);
    }
    
    double area() 
    {
       return dim1 * dim2 / 2;
    }
 }
 public class Inheritance_04 
 {
    public static void main(String args[]) 
    {
       Diagram d = new Diagram(10, 10); // creating object of abstract class
       Rectangle r = new Rectangle(9, 5);
       Triangle t = new Triangle(10, 8);
       System.out.println("Area of Rectangle is: " + r.area());
       System.out.println("Area of Triangle is:" + t.area());
    }
 }