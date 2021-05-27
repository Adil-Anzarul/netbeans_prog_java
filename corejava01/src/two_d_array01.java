/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class two_d_array01 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][4];
    System.out.println("Enter elements of array");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
        System.out.println("enter element in "+(i+1)+" th row and "+(j+1)+" th column");
        a[i][j]=sc.nextInt();
        }
    }
    System.out.println("the matrix is");
    for(int i=0;i<3;i++)
    {
    for(int j=0;j<4;j++)
    {
    System.out.print("  "+a[i][j]);
    }
    System.out.println("");
    }
    
    }
    
}
