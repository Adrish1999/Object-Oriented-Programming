//A program in JAVA to Create a user defined exception called "MyException". Create a method "compute".
//Display the value of a. if a>10 then it will throw an Exception with a message "Invalid Input".


import java.io.*;

class MyException extends Exception
{
    String s;
    MyException(String t)
    {
        s = t;
    }
    public String compute() 
    {
        return s;
    }
}


class Program_01
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter a number");
            int a = Integer.parseInt(br.readLine());
            if(a > 10)
            throw new MyException("Invalid Input");
            else
            {
                System.out.println("Value of a : "+a);
            }
        }
        catch(MyException e)
        {
            System.out.println(e.compute());
        }
    }
}