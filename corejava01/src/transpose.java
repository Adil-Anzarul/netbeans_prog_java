/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class transpose 
{
    public static void main(String args[])
    {
    int a[][],m,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of rows and then enter n of column");
    m=sc.nextInt();
    n=sc.nextInt();
    a=new int[m][n];
    int t[][]=new int[n][m];
    System.out.println("Enter elements of array");
    for(int i=0;i<m;i++)
    {
    for(int j=0;j<n;j++)
    {
    a[i][j]=sc.nextInt();
    t[j][i]=a[i][j];
    }
    }
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<m;j++)
    {
    System.out.print("  "+t[i][j]);
    }
    System.out.println("");
    }
    }
    
}
