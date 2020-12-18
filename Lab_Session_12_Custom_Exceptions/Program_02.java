//A program in JAVA to throw custom exception

import java.io.*;

class MyException extends Exception
{
    String s;
    MyException(String t)
    {
        s = t;
    }
    public String getMessage() 
    {
        return s;
    }
}


class Program_02
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter 2 numbers");
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            if(a<b)
            throw new MyException("Error, First number should be greater than the second number");
            else
            System.out.println("The input format is correct");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}