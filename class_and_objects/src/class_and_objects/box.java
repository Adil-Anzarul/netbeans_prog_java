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
public class box 
{
 double length,breadth,height;
 
 void input( ) 
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter dimensions of box");
     length =sc.nextDouble();
     breadth=sc.nextDouble();
     height=sc.nextDouble();
 }
 void show()
 {
     System.out.println("length= "+length);
     System.out.println("breadth= "+breadth);
     System.out.println("height= "+height);
 }
 double volume()
 {
 return(length*breadth*height);
 }
 void showvolume()
 {
 System.out.println("Required volume is= "+length*breadth*height);
 }
}


class compare
{
public static void main(String args[])
{
box b1=new box();
box b2=new box();
box b3=new box();
b1.input();
b1.show();
b2.input();
b2.show();
b3.input();
b3.show();

double v1=b1.volume();
double v2=b2.volume();
double v3=b3.volume();

b1.showvolume();
b2.showvolume();
b3.showvolume();

if(v1>v2 && v1>v3)
    System.out.println(" volme of Boxx 01 is greater");
else if(v2>v1 && v2>v3)
    System.out.println(" volume of Boxx 02 is greater");
else if(v3>v1 && v3>v2)
    System.out.println(" volume of Box 03 is greater");
else if(v1==v2 && v2==v3 )
    System.out.println(" volume if ll 3 boxes are equal");
}
}