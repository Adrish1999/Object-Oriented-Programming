//Program to find out maximum and minimum out of n integers using command line argument

import java.io.*;

class Program_01
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int min = Integer.parseInt(args[1]);
        System.out.println("Value of n entered by the user is : "+n);
        for(int i = 2; i <= n; i++)
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
        System.out.println(n+" numbers entered by the user are :");
        for(int i = 1; i <= n; i++)
        {
            System.out.println(Integer.parseInt(args[i]));
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
    }
}
