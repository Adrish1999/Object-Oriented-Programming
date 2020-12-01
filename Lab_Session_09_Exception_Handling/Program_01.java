//JAVA program to demonstrate what happens if an exception is not handled

//JAVA program to delete an element from given position in an integer array

import java.io.*;

class Program_01
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the location from where you wish to delete element");
    }
}