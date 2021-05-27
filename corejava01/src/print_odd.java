/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class print_odd 
{
    public static void main(String args[])
    {
        
 int a,b;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter two no.");
 a=sc.nextInt();
 b=sc.nextInt();
 if(a>b)
 {
 a=a+b;
 b=a-b;
 a=a-b;
 }
 for(int i=a;i<=b;i++)
 {if(i%2!=0)
 {
 System.out.println(i);
 }
 }
 
    }
}
