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
        int position = Integer.parseInt(br.readLine());

        System.out.println("Original array: ");
        for(int i=0; i < n; i++)
        {
                System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println();

        // Here if the position is greater the size of the array, then ArrayIndexOutOfBoundsException will be thrown
        System.out.println("Currently, element at position "+position+" is "+arr[position-1]);

        System.out.println();
        System.out.println();
        // The below lines get executed only if position is less than or equal to the size of the array
        for(int k = position - 1; k < n - 1; k++)
        {
            arr[k] = arr[k+1];
        }

        System.out.println("New array after deletion:");

        for(int i = 0; i < n - 1; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}