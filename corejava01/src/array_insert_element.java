/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class array_insert_element 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter element of array");
    for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();
    }
    System.out.println("enter the following ");
    System.out.println("inter element u want to insert");
    int I=sc.nextInt();
    System.out.println("Enter position at which u want to insert");
    int posn=sc.nextInt();
    int z[]=new int[n+1];
    for(int i=0;i<posn-1;i++)
    {z[i]=a[i];}
    z[posn-1]=I;
    for(int i=posn;i<=a.length;i++)
    {
    z[i]=a[i-1];
    }
    System.out.println("your modified array is");
    for(int i=0;i<z.length;i++)
    {
    System.out.println(z[i]);
    }
    
    }
    
}
