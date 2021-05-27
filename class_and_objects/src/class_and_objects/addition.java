/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */
class Addition 
{
    static int Add(int x,int y)
    {
    int s=x+y;
    return(s);
    }
    
    public static void main(String args[])
    {
    int a=5;
    int b=6;
    int s=Add(a,b);
    System.out.println("sum = "+s);
    }
}
