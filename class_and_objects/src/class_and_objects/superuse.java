/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */
class A001
{
    int i=10;
    
}

class B001 extends A001
{
int i;
B001(int a, int b)
{

super.i=a;
i=b;
}
void show()
{System.out.println(" i in super class = "+super.i);
System.out.println(" i in sub class = "+i);
}
}


class usesuper
{
public static void main(String args[])
{
    A001 h=new A001();
B001 ob=new B001(2,4);
ob.show();
System.out.println("  "+h.i);
}
}