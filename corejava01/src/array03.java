/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
/* this is to find sum of even and pro od odd elements of array */
import java.util.*;
public class array03 
{
 public static void main(String args[])
 { int pro=1 ,sum=0;
 Scanner sc=new Scanner(System.in);
 int a[]=new int[10];
 System.out.println("enter 10 elements of array");
 for(int i=0;i<a.length;i++)
 {
 a[i]=sc.nextInt();
 if(a[i]%2==0)
     sum+=a[i];
 else if(a[i]%2!=0)
     pro=pro*a[i];
 }

 System.out.println("Sum of all even elements = "+sum);
 System.out.println("Product of all odd elements ="+pro);
 }
}
