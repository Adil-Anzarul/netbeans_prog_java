/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class offandmaindiagonal 
{
    public static void main(String args[])
    {
        int sumM=0,sumO=0;
    Scanner sc=new Scanner(System.in);
    int a[][];
    System.out.println("enter no. of rows");
    int n=sc.nextInt();
    System.out.println("enter n. of column");
    int m=sc.nextInt();
    a=new int[n][m];
    System.out.println("Enter elements of array");
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<m;j++)
    {
    a[i][j]=sc.nextInt();
    }
    }
    
    if(m==n)
    {
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<m;j++)
    {
    if(j==i)
        sumM+=a[i][i];
    
    
    }
    sumO+=a[i][m-1-i];
    }
    System.out.println("Sum of main diagonal elements = "+sumM);
    System.out.println("Sum of off  diagonal elements = "+sumO);
    
    }
    else
        System.out.println("not a square matrix");
    }
    
}
