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
class Rectangle004  
{
    double length;
    double breadth;
    
    Rectangle004() //default constructor
    {
    
    length=breadth=0;
    }
    Rectangle004(Rectangle004 ob)   //copy constructor
    {
    length=ob.length;
    breadth=ob.breadth;
    }
    double area()
    {
    return(length*breadth);
    }
    Rectangle004(double l, double b)  //parameterised constructor
    {
    length=l;
    breadth=b;
    }
 }


class test
{
public static void main(String args[])
{
Rectangle004 abcd=new Rectangle004(5,6);
System.out.println("Area of reactangle abcd= "+abcd.area());
Rectangle004 efgh=new Rectangle004(abcd);
System.out.println("Area of reactangle efgh= "+efgh.area());

}
}