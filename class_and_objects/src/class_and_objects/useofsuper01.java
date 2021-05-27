/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */

/*
 * this is to show the 
 * use of super keyword to call
 * constructor of super class
 */




class X
{
    X()
    {
    System.out.println(" Constructor of class X .");
    }
    X(int x)
    {
    System.out.println(" The valu of X = "+x);
    }
}

class Y extends X
{
    int a;
Y()
{ 
    super();
System.out.println(" constructor of class Y .");
}
Y(int x, int y)
{
super(x);
a=y;
System.out.println(" The valu of A = "+y);
}
}

class demo01
{
public static void main(String args[])
{
   
Y dc=new Y();
Y h=new Y(200,100);
}
}