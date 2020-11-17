import java.io.*;

class Pet
{
    String name;
    Integer age; 
  
    Pet(String n, int a)
    {
      this.name=n;
      this.age=a;
    }
    //Over-riding the toString() function as a class function
    public String toString()
    {
      return "The name of the pet is " + this.name + ". The age of the pet is " + this.age;
    }
}
  
  class Program_01
  {
      public static void main( String args[] ) throws IOException
      {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the pet name: ");
        String pet_name = br.readLine();
        System.out.println("Enter the pet age: ");
        int pet_age = Integer.parseInt(br.readLine());
        Pet p = new Pet(pet_name,pet_age);
        //Calling the class version of toString()
        System.out.println(p.toString());
        //Calling the original toString()
        System.out.println(Integer.toString(12));
      }
  }