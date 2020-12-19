//Regex quantifiers

import java.util.regex.*;

class Regex_3
{
    public static void main(String[] args)
    {
        System.out.println("? quantifier .......");
        System.out.println(Pattern.matches("[ayz]?","a"));
        System.out.println(Pattern.matches("[ayz]?","aaa"));
        System.out.println(Pattern.matches("[ayz]?","ayyyyzz"));
        System.out.println(Pattern.matches("[ayz]?","amnta"));
        System.out.println(Pattern.matches("[ayz]?","ayz"));
        System.out.println("+ quantifier .......");
        System.out.println(Pattern.matches("[ayz]+","a"));
        System.out.println(Pattern.matches("[ayz]+","aaa"));
        System.out.println(Pattern.matches("[ayz]?","aayyyyyzz"));
        System.out.println("* quantifier ........");
        System.out.println(Pattern.matches("[ayz]*","ayyyyyza"));
    }
}