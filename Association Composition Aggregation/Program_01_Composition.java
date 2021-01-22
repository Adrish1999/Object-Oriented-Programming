//Java program to illustrate the concept of composition

import java.io.*;
import java.util.*;

//class Dish
class Dish
{ 
  
    public String name; 
    public int price; 
      
    Dish(String name, int price) 
    { 
          
        this.name = name; 
        this.price = price; 
    } 
} 
  
// Restaurant class contains  
// list of dishes. 
class Restaurant 
{ 
  
    // reference to refer to list of dishes. 
    private final List<Dish> dishes; 
      
    Restaurant(List<Dish> dishes) 
    { 
        this.dishes = dishes;  
    } 
      
    public List<Dish> getTotalDishesInRestaurant(){ 
          
       return dishes;   
    } 
      
} 


class Program_01_Composition
{
    public static void main(String args[])
    {
        Dish d1 = new Dish("Chicken Biryani",220); 
        Dish d2 = new Dish("Mutton Biryani",260); 
        Dish d3 = new Dish("Chicken Rezala",240);
        Dish d4 = new Dish("Chicken Tikka Masala",250);
        Dish d5 = new Dish("Chicken Butter Masala",240); 
          
    
        List<Dish> dishes = new ArrayList<Dish>(); 
        dishes.add(d1); 
        dishes.add(d2); 
        dishes.add(d3); 
        dishes.add(d4);
        dishes.add(d5);
          
        Restaurant restaurant = new Restaurant(dishes); 
          
        List<Dish> dsh = restaurant.getTotalDishesInRestaurant(); 
        for(Dish d : dsh)
        { 
              
            System.out.println("Dish name : " + d.name + "\tand\t" 
            +" Price(Rs) : " + d.price); 
        }
    }
}
  