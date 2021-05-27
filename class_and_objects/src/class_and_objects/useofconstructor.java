/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */
import java.util.Scanner;
class Rectangle002
{
  double length;
  double breadth;
  
  Rectangle002()    //constructor
  {
  length=breadth=0;
  }
  void input(double l, double b)
  {
  length=l;
  breadth=b;
  }
  void display()
  {
  System.out.println(" length= "+length+"\n breadth= "+breadth);
  }
  
  double area()
  {
  return(length*breadth);
  }
  
}



class Rectdemo
{
public static void main(String args[])
{
   
Rectangle002 R1=new Rectangle002();
R1.display();
Scanner sc=new Scanner(System.in);
System.out.println("enter length and breadth");
double l=sc.nextDouble();
double b=sc.nextDouble();
R1.input(l, b);
R1.display();
System.out.println("Area of rect = "+R1.area());
}
}
