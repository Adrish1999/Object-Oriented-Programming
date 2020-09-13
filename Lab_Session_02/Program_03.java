//Java Program to illustrate anonymous object

import java.io.*;

class Factorial
{
    int num;
    Factorial(int num)
    {
        this.num = num;
    }
    public int Calculate()
    {
        int p = 1;
        for(int i = 1; i <= num ; i++)
        {
            p = p*i;
        }
        return p;
    }
}

class Program_03
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Factorial of "+num+" is "+new Factorial(num).Calculate()); // Anonymous object
    }
}