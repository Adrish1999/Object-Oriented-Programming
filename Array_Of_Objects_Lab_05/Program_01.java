import java.io.*;
import java.lang.*;

class Figure
{
    int d1 , d2;
    Figure(int a , int b)
    {
        d1 = a;
        d2 = b;
    }
    double area(){ return 0.0;}
    void show(){}
}

class Rectangle extends Figure
{
    Rectangle(int a , int b)
    {
        super(a,b);
    }
    double area()
    {
        super.area();
        return (d1*d2);
    }
    void show()
    {
        super.show();
        System.out.println("Length of the rectangle: "+d1);
        System.out.println("Breadth of the rectangle: "+d2);
        System.out.println("Area of the rectangle: "+this.area());
    }
}

class Triangle extends Figure
{
    int c;
    Triangle(int a , int b , int c)
    {
        super(a,b);
        this.c = c;
    }
    double area()
    {
        super.area();
        double p = (d1+d2+this.c)/2;
        return Math.sqrt(p*(p-d1)*(p-d2)*(p-this.c));
    }
    void show()
    {
        super.show();
        System.out.println("Side 1 of the triangle: "+d1);
        System.out.println("Side 2 of the triangle: "+d2);
        System.out.println("Side 3 of the triangle: "+this.c);
        System.out.println("Area of the triangle: "+this.area());
    }
}

class Program_01
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Figure obj[] = new Figure[2];
        System.out.println("Enter the dimensions of the rectangle");
        int side1 = Integer.parseInt(br.readLine());
        int side2 = Integer.parseInt(br.readLine());
        obj[0] = new Rectangle(side1 , side2);
        obj[0].show();
        System.out.println("Enter the dimensions of the triangle");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        obj[1] = new Triangle(a,b,c);
        obj[1].show();
    }

}