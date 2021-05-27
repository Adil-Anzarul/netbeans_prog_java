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
class Rectangle003 
{
    double length;
    double breadth;
    
    Rectangle003(double l, double b)
    {
    length=l;
    breadth=b;
    }
    
    void input()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length & breadth");
    length=sc.nextDouble();
    breadth=sc.nextDouble();
    
    }
    
    void display()
    {
    System.out.println("length= "+length+"\n breadth= "+breadth);
    }
    double area()
    {
    return(length*breadth);
    } 
 }




class Rectdemo003
{
    
public static void main(String args[])
{
Rectangle003 r1=new Rectangle003(2,4);

r1.display();
r1.input();
r1.display();

System.out.println(" Area= "+r1.area());
}

}