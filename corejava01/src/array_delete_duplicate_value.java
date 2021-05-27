/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
//this is tofind duplicate value (if any)
 import java.util.*;
public class array_delete_duplicate_value 
{
 public static void main(String args[])
 {
 int a[];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the size of array");
 int n=sc.nextInt();
 a=new int[n];
 System.out.println("Enter elements of array");
 for(int i=0;i<a.length;i++)
 {
 a[i]=sc.nextInt();
 }
 System.out.println("Duplicate values are (if any)");
 for(int i=0;i<a.length;i++)
 {
 for(int j=i+1;j<a.length;j++)
 {
 if(a[j]==a[i])
 System.out.println(a[j]+" position ="+(j+1));
 }
 }
 }
}
