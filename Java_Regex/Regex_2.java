//Regex Character class

import java.util.regex.*;

class Regex_2
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("[xyz]");
        Matcher matcher1 = pattern.matcher("wxcd");
        Matcher matcher2 = pattern.matcher("x");
        Matcher matcher3 = pattern.matcher("xxyyyyyz");
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());
    }
}