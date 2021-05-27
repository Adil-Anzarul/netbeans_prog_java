/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
/*this program is to take elements of array and to show them */
import java.util.*;
public class array01 
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int a[]=new int[5];
 for(int i=0;i<=4;i++)
 {
 System.out.println("Enter "+(i+1)+" th element of array");
 a[i]=sc.nextInt();
 }
 System.out.println("Five elements are");
 for(int j=0;j<a.length;j++)
 {
 System.out.println(a[j]);
 }
}
}
