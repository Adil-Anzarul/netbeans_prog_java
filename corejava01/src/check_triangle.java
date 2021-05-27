/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class check_triangle 
{
public static void main(String args[])
{
int a,b,c;
System.out.println("enter sides of triangles");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a==c &&a==b)System.out.println("it is equilateral");
else if(a==b || b==c ||c==a)
    System.out.println("it is isoscelese");
else
    System.out.println("it is scalen");
    
}
}
