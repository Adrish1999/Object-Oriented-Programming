import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;


public class Pattern_Syntax_Checker
{
	public static void main(String[] args)
  	{
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
    
		while(in.hasNextLine())
    		{
			String pattern = in.nextLine();
          	
            		try
            		{
                		Pattern pat = Pattern.compile(pattern);
                		System.out.println("Valid");
            		}
            		catch(PatternSyntaxException e)
            		{
               			 System.out.println("Invalid");
            		}
		}
	}
}
