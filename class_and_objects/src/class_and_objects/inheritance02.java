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
class A1 
 {
     private int i;
     public A1()
     {
     i=5;
     }
     public void showi()
     {
     System.out.println(" i = "+i);
     
     
     }
     
     void input()
     {
         Scanner h=new Scanner(System.in);
         System.out.println("Enter value of i");
        int j=h.nextInt();
     i=j;
     }
  }

class B1 extends A1
{
private int j;
public int k;
public void showij()
{
System.out.println(" j = "+j);
showi();
 //System.out.println(" i ="+i); this code will show error
j=6;
}
}


class privatedemo
{
public static void main(String args[])
{
A1 sc=new A1();
B1 ob=new B1();

//sc.i=7;
sc.showi();

//ob.j=8;
ob.k=18;
ob.showij();
//ob.i=9;
sc.input();
sc.showi();
}
}