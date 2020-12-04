//Java program to show error due to unreachable code


import java.io.*;

class Program_02
{
    public static void main(String[] args)
    {
        int i  = 0;
        while(true) // infinite loop
        {
            i++;
        }
        System.out.println(i); // Unreachable statement
    }
}