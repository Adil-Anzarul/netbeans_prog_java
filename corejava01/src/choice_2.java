/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class choice_2 
{
    public static void main(String args[])
    {
    int a,b;
    int c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a no.");
    a=sc.nextInt();
    System.out.println("enter yourchoice \n 1-check even odd"
            + " \n 2-check prime or not \n 3-check armstrong or not");
    c=sc.nextInt();
    switch (c)
    {
        case 1:
            if(a%2==0)
                System.out.println(""+a+" is even no.");
            else
                System.out.println(""+a+" is odd  no.");
            break;
        case 2:
            int flag=0;
            for(int i=2;i<=a/2;i++)
            {
            if(a%i==0)
            {
            flag=1;
            break;
            }
            }
            if(flag==1)
                System.out.println(""+a+" is not prime");
            else
                System.out.println(""+a+" is  prime no.");
            break;
        case 3:
            int sum=0,dig;
            for(int i=a;i!=0;i=i/10)
            {
            dig=i%10;
            sum=sum+dig*dig*dig;
            }
            if(sum==a)
                System.out.println(""+a+" is armstrong no.");
            else
                System.out.println(""+a+" is not armstrong no.");  
    }
    }
    
}
