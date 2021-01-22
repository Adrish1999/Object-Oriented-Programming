import java.io.*;

class Static_Members
{
   static int num;
   static String mystr;

   //First Static block
   static
    {
      System.out.println("Static Block 1 is running.....");
      num = 68;
      mystr = "Block1";
    } 

  //Second static block
  static
    {
      System.out.println("Static Block 2 is running.....");
      num = 98;
      mystr = "Block2";
    }
    //Static method
  static void display()
    {
     System.out.println("num :"+num);
     System.out.println("My string :"+mystr);
    }

  //non-static method
  void funcn()
  {
      //Static method called in non-static method
      display();
  }
  public static void main(String args[])
   {
      Static_Members obj = new Static_Members();

      obj.funcn(); // calling non-static method through object of the class

      display(); // calling static method directly in static main method
   }
 }