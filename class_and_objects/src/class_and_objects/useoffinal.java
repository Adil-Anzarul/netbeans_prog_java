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

class area 
{
public static void main(String args[])
{
 /*   
final int a=5;
a++;
     this code will show error
     */
    Scanner c=new Scanner(System.in);
   
    final double pi=3.1428;
     System.out.println("Enter radius");
    double r=c.nextDouble();
    double a=pi*r*r;
    System.out.println("Area= "+pi*r*r);
}
}
