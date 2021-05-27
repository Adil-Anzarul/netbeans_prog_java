/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class palindrom_armstrong 
{
    public static void main(String args[])
    {System.out.println("enter a number");
    int n,rev=0,sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=n;i!=0;i=i/10)
    {
    int dig=i%10;
    rev=rev*10+dig;
    }
    if(rev==n)
        System.out.println("it is palindrom");
    else
        System.out.println("it is not palindrom");
    
    
    for(int i=n;i!=0;i=i/10)
    {
    int dig=i%10;
    sum=sum+dig*dig*dig;
    }
    if(sum==n)
        System.out.println("it is armstrong");
    else
        System.out.println("it is not armstrong no.");
    }
    
}
