//Java Program to throw IllegalArgumentException

import java.io.*;

class Program_02
{
    public static void main(String args[])throws IOException
    {
        try
        {
		if (args.length > 3)
			throw new IllegalArgumentException("Exception");
		else
			System.out.println("Number of arguments is less than 3");
		}
        catch(IllegalArgumentException e)
        {
			System.out.println("Length greater than 3 is not accepted");
		}
    }
}
