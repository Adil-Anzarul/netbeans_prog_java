/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */
//this prog. is to show the use of 'this' key word
import java.util.Scanner;
 class rectangle 
{
    int length;
    int breadth;
    void settim(int l,int b)
    {
    this.length=l;
    this.breadth=b;
    
    }
    
    int area()
    {
    return(this.length*this.breadth);
    }
    
    rectangle()
    {
    length=breadth=0;
    }
    rectangle(int l,int b)
    {
    this.length=l;
    this.breadth=b;
    }
}




class test01
{
public static void main(String args[])
{
rectangle r1=new rectangle(5,6);
System.out.println("Area of r1= "+r1.area());
r1.settim(6, 8);
System.out.println("Area of r1= "+r1.area());
}
}