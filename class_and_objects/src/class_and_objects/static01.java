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
class useofstatic 
{
    static int a=3;
    static int b;
    static void meth(int x)
    {
    System.out.println(" x= "+x);
    System.out.println(" a = "+a);
    System.out.println(" b= "+b);
    }
    
   static    // static block get executed as soon as a class is compiled
    {
    System.out.println("Static block initialized");
    b=a*4;
    }
  /*  public static void main(String args[])
    {
    meth(42);
    } */
    
}


class test001
{
public static void main(String ags[])
{
useofstatic.meth(42);
}
}