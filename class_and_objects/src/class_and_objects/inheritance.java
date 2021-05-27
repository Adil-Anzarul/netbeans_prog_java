/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */
class A 
{
    int i,j;
    void showij()
    {
    System.out.println(" i and j are "+i+" , "+j);
    }
}
class B extends A
{
int k;
void showk()
{
System.out.println(" k ="+k);
}
void sum()
{
System.out.println(" i+j+k = "+(i+j+k));
}
}

class Simpleinheritance
{
public static void main(String args[])
{
A superob=new A();
B subob=new B();
superob.i=10;
superob.j=20;
System.out.println(" contents of superob ");
superob.showij();
subob.i=7;
subob.j=8;
subob.k=9;
subob.showij();
subob.showk();
System.out.println(" Sum of i,j and k in subob ");
subob.sum();
superob.showij();
}
}
