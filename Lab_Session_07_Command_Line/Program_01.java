//Program to find out maximum and minimum out of 5 integers using command line argument

import java.io.*;

class Program_01
{
    public static void main(String args[])
    {
        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[0]);
        for(int i = 1; i <= 4; i++)
        {
            if(Integer.parseInt(args[i]) > max)
            {
                max = Integer.parseInt(args[i]);
            }
            if(Integer.parseInt(args[i]) < min)
            {
                min = Integer.parseInt(args[i]);
            }
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
    }
}
