import java.io.*;


class Static_Member
{ 
  static int x = 0; // It will get memory only once and retain its value. 
  Static_Member() 
  { 
     x++; // It will increment the static variable by 1 for each object creation. 
  } 
void display() 
{ 
   System.out.println(x); 
} 
public static void main(String[] args) 
{ 
    Static_Member c1 = new Static_Member(); 
     c1.display(); 
    Static_Member c2 = new Static_Member(); 
     c2.display(); 
    Static_Member c3 = new Static_Member(); 
     c3.display(); 
  } 
}