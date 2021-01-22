import java.io.*;

interface vehicle
{
    public static final int gear_no = 2;
    public static final double initial_speed = 20.0;
    public int gear();
    public double speed();
    public double breakk();
    public void printstatus();
}

class Car implements vehicle
{
    public int gear()
    {
        return gear_no;
    }
    public double speed()
    {
        return (initial_speed + 5.0);
    }
    public double breakk()
    {
        return (initial_speed - 5.0);
    }
    public void printstatus()
    {
        System.out.println();
        System.out.println("Initially...........");
        System.out.println("Gear number of the car : "+gear_no);
        System.out.println("Speed of the car : "+initial_speed);
        System.out.println();
        System.out.println("After changing gear...........");
        System.out.println("Gear number of the car : "+(gear_no + 2));
        System.out.println("New speed of the car : "+speed());
        System.out.println();
        System.out.println("After applying brake...........");
        System.out.println("Gear number of the car : "+(gear_no-1));
        System.out.println("New speed of the car : "+breakk());
    }
}


class Bike implements vehicle
{
    public int gear()
    {
        return gear_no;
    }
    public double speed()
    {
        return (initial_speed + 10.0);
    }
    public double breakk()
    {
        return (initial_speed - 10.0);
    }
    public void printstatus()
    {
        System.out.println();
        System.out.println("Initially...........");
        System.out.println("Gear number of the bike : "+gear_no);
        System.out.println("Speed of the bike : "+initial_speed);
        System.out.println();
        System.out.println("After changing gear...........");
        System.out.println("Gear number of the bike : "+(gear_no+1));
        System.out.println("New speed of the bike : "+speed());
        System.out.println("After applying brake...........");
        System.out.println();
        System.out.println("Gear number of the bike : "+(gear_no-1));
        System.out.println("New speed of the bike : "+breakk());
    }
}

class Interface_01
{
    public static void main(String[] args)
    {
        Car obj1 = new Car();
        Bike obj2 = new Bike();
        obj1.printstatus();
        obj2.printstatus();
    }
}