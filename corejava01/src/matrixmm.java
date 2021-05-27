/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class matrixmm 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a[][],m,n;
    System.out.println("enter no of rows");
    m=sc.nextInt();
    System.out.println("enter no of column");
    n=sc.nextInt();
    a=new int[m][n];
    System.out.println("enter elements of array");
    for(int i=0;i<m;i++)
    {
    for(int j=0;j<n;j++)
    {
    a[i][j]=sc.nextInt();
    }
    }
    int max=a[0][0],min=a[0][0];
     for(int i=0;i<m;i++)
    {
    for(int j=0;j<n;j++)
    {
    if(a[i][j]>max)
        max=a[i][j];
    if(a[i][j]<min)
        min=a[i][j];
    }
    }
     int diff=max-min;
     System.out.println("Required difference is = "+diff);
    
    }
    
}
