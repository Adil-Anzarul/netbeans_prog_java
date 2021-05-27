/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
//this prog. is to fint 2nd highest element in array
import java.util.*;
public class array08 
{
    public static void main(String arg[])
    {  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt(); 
    int a[]=new int[n];
    System.out.println("enter "+n+" elements of array");
    for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();
    }
    int max=a[0];
    for(int i=0;i<a.length;i++)
    {
    if(a[i]>max)
    max=a[i];
    }
    int smax=a[0];
    for(int i=0;i<a.length;i++)
    {
    if(a[i]>smax && a[i]<max)
        smax=a[i];
    }
    
    System.out.println("Second highest element of array is ="+smax);
    }
    }
