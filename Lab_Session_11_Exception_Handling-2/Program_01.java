//Java Program to throw explicit exception and re-throw the exception from main 

import java.io.*;


class Program_01
{
    public static void Divide(int a, int b)
    {
        try
        {
            if(b == 0)
            throw new ArithmeticException("Arithmetic Exception caught");
            int c = a/b;
            System.out.println(a+" / "+b+" = "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception caught in method Divide()");
            throw e;
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the dividend:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the divisor:");
        int b = Integer.parseInt(br.readLine());
        try
        {
           Divide(a,b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception caught in main()");
        }
    }
}