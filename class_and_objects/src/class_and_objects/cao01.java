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
 class Rectangle 
{
    double length;
    double breadth;
    

void getdata(double l,double b)
{
length=l;
breadth=b;
}

void display()
{
System.out.println("length= "+length);
System.out.println("breadth= "+breadth);
}

double area()
{
double a=length*breadth;
return(a);
}
}


class Recdemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter parameters of rectangle");
    double l=sc.nextDouble();
    double b=sc.nextDouble();
       Rectangle r=new Rectangle();
       r.getdata(l,b);
       r.display();
       double a=r.area();
       System.out.println(" area of rectngle = "+a);
    }
}