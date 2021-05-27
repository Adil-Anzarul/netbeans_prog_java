/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class sumof_offdiagonal 
{
    public static void main(String args[])
    {
    int a[][]={{2,4,6,5,1},
               {4,2,6,8,9},
               {1,2,3,4,6},
               {2,2,4,3,6},
               {1,2,4,6,7}};
    int i,j,sum=0;
    for( i=0;i<5;i++)
    {
    sum+=a[i][5-i-1];
    }
    System.out.println("sum of off diagonal elements = "+sum);
    }
    
}
