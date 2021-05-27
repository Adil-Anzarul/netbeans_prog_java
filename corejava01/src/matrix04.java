/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */import java.util.*;
public class matrix04 
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
    System.out.println("enter element in "+(i+1)+" th column and "+(j+1)+" th column");
    a[i][j]=sc.nextInt();
    }
    }
    int t[][]=new int[4][3];
    for(int i=0;i<4;i++)
    {sum=0;
    for(int j=0;j<3;j++)
    {
    t[i][j]=a[j][i];
    sum+=t[i][j];
    }
    System.out.println("sum of element in "+(i+1)+" th column is= "+sum);
    }
    }
}
