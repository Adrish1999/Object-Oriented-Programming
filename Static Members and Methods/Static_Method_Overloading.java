public class Static_Method_Overloading{
 
    public static void main(String args[]) {
        greet("John"); 
        greet("John", "Good Morning"); 
    }
 
    
    //non static method which will be overloaded
    public void greet(String name){
        System.out.println("Hello " + name);
    }
 
    /*
     * Another static method which overloads above Hello method
     * This shows that we can overload static method in Java
     */
    public static void greet(String name, String greeting){
        System.out.println(greeting + " " + name);
    }


}

