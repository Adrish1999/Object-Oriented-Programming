import java.util.regex.*;

class Regex_4
{
    public static void main(String[] args)
    {
        System.out.println("d metacharacter ......");
        System.out.println(Pattern.matches("d?","1234"));
        System.out.println(Pattern.matches("d?","1"));
        System.out.println(Pattern.matches("d?","abc"));
        System.out.println(Pattern.matches("d?","abc123"));

        System.out.println("D metacharacter ......");
        System.out.println(Pattern.matches("D","1234"));
        System.out.println(Pattern.matches("D","1"));
        System.out.println(Pattern.matches("D","abc"));
        System.out.println(Pattern.matches("D","abc123"));
        System.out.println(Pattern.matches("D","a"));

        System.out.println("D metacharacter with quantifier......");
        System.out.println(Pattern.matches("D*","abcd"));
    }
}