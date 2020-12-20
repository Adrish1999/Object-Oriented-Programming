import java.io.*;
import java.util.regex.*;

class Email_Validator
{
    Pattern pattern;
    Matcher matcher;

    String EMAIL_PATTERN = "^[_A-Za-z0-9\\+-]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    Email_Validator()
    {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean Validate(String str)
    {
        matcher = pattern.matcher(str);
        return (matcher.matches());
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of email addresses to be verified: ");
        int n = Integer.parseInt(br.readLine());
        String[] emails = new String[n];
        System.out.println("Enter the email addresses: ");
        for(int i=0; i<n; i++)
        {
            emails[i] = br.readLine();
        }

        Email_Validator obj = new Email_Validator();
        for(String temp : emails)
        {
            boolean valid = obj.Validate(temp);
            System.out.println((valid == true)?temp+" is a valid email-id":temp+" is not a valid email-id");
        }
    }
}


