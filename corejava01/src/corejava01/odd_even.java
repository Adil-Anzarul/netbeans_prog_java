/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava01;

/**
 *
 * @author pc
 */
import java.io.*;
public class odd_even 
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a number");
a=Integer.parseInt(ob.readLine());
if(a%2==0)
    System.out.println("it is even no.");
else
    System.out.println("it is odd");
}
}
