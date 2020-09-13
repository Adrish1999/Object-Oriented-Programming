//Java Program to create a class called Piggy_bag 

class Piggy_bag
{
    double balance;
    Piggy_bag() // default constructor
    {
        balance = 40.0;
    }
    public double ShowBalance()
    {
        return balance;
    }
    public void AddBalance(double amount)
    {
        balance += amount;
    }
}

class Program_04
{
    public static void main(String args[])
    {
        Piggy_bag pb = new Piggy_bag();
        System.out.println("Initial balance in the piggy bag is "+pb.ShowBalance());
        pb.AddBalance(500.0);
        System.out.println("Balance in the piggy bank after adding Rs 500 is "+pb.ShowBalance());
    }
}