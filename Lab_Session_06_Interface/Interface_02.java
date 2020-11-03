import java.io.*;

interface Square 
{
    public static final double side = 5.0;
    public void Square_Area();
}

class Geometry implements Square
{
    double area;
    Geometry()
    {
        area = 0.0;
    }
    public void Square_Area()
    {
        area = side*side;
        System.out.println("Length of a side of the square is : "+side);
        System.out.println("Area of the square is : "+area);
    }
}

class Interface_02
{
    public static void main(String[] args)
    {
        Square obj = new Square();  // Creating object of interface Square
        obj.Square_Area();
    }
}