//Matcher and Pattern classes

import java.util.regex.*;

public class Regex_1
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("AxxB");
        System.out.println("String matches the given regex: "+matcher.matches());
    }
}