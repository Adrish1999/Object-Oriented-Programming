// A Java program to demonstrate Arithmetic exception and Null Pointer exception
import java.io.*; 
  
class Program_01
{ 
    public static void main (String[] args) throws IOException
    { 
        // Initializing String variable with null value 
        String ptr = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the dividend :");
        int dividend = Integer.parseInt(br.readLine());
        System.out.println("Enter the divisor :");
        int divisor = Integer.parseInt(br.readLine());
  
        try
        { 
            int quotient = 0;
            //This line of code throws Arithmetic Exception if divisor is zero
            quotient = dividend / divisor;

            System.out.println("Quotient when "+dividend+" is divided by "+divisor+" is "+quotient);

            // This line of code throws NullPointerException 
            // because ptr is null 
            if (ptr.equals("JAVA")) 
                System.out.print("The string is JAVA"); 
            else 
                System.out.print("The string is not JAVA"); 
        } 

        catch(NullPointerException e) 
        { 
            System.out.print("NullPointer Exception Caught"); 
        } 
        catch(ArithmeticException ob)
        {
            System.out.println("Arithmetic Exception caught");
        }
    } 
} 