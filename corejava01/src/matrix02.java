/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class matrix02 
{
    public static void main(String args[])
    {int sum=0;
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][4];
    System.out.println("enter elements of array");
    for(int i=0;i<3;i++)
    {
    for(int j=0;j<4;j++)
    {
    System.out.println("enter element in "+(i+1)+" th row and "+(j+1)+" th column");
    a[i][j]=sc.nextInt();
    if(a[i][j]%2==0)
        sum+=a[i][j];
    }
    }
    System.out.println("Sum of all even elements arte = "+sum);
    
    }
    
}
