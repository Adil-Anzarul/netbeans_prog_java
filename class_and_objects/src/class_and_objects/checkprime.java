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
class checkprime 
{
    static void prime(int n)
    {
    int flag=0;
    for(int i=2;i<n/2;i++)
    {
    if(n%i==0)
    {
    flag=1;
    break;
    }
    }
    if(flag==0)
        System.out.println("it is prime");
    else
        System.out.println("it is not prime");
    }
    
}

class test002
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
int x=sc.nextInt();
checkprime.prime(x);
}
}
