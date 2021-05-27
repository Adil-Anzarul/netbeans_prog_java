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
class Rectangle01 
{
    double length;
    double breadth;
    
    void input(double l,double b)
    {
    length=l;
    breadth=b;
    }
    double area()
    {
    return (length*breadth);
    }
    void display()
    {
    System.out.println("length= "+length);
    System.out.println("breadth= "+breadth);
    }
}


class reacdemo
{
public static void main(String args[])
{
    double l,b;
    Rectangle01 R1=new Rectangle01(); 
    Rectangle01 R2=new Rectangle01();
    Scanner sc=new Scanner(System.in);
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter dimensions of first square");
    l=sc.nextDouble();
    b=sc.nextDouble();
    R1.input(l, b);
    R1.display();
    System.out.println("Enter dimensions of second square");
    l=ob.nextDouble();
    b=ob.nextDouble();
    R2.input(l, b);
    R2.display();
    
    double a1=R1.area();
    double a2=R2.area();
    
    
    if(a1>a2)
        System.out.println("Area of first rectanle is greater");
    else if(a2>a1)
        System.out.println("Area of second rectanle is greater");
    else if(a1==a2)
            System.out.println("Area of both rectangles ae equal");
}
}