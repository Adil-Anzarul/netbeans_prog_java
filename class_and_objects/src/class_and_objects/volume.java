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
 class volume 
{
double length;
double breadth;
double height;

void getdata(double l,double b,double h)
{
length=l;
breadth=b;
height=h;
}
void display()
{
System.out.println("length= "+length);
System.out.println("breadth= "+breadth);
System.out.println("height= "+height);
}

double volume()
{
double a;
a=length*breadth*height;
return(a);
}
}

class Volumedemo 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter dimensions of cuboid");
    double  l,b,h;
    l=sc.nextDouble();
    b=sc.nextDouble();
    h=sc.nextDouble();
    volume v=new volume();
    v.getdata(l, b, h);
    v.display();
    double a=v.volume();
    System.out.println("volume is = "+a);
    }
}
