/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
/*this program is to take average of all elements of array */
import java.util.Scanner;
public class array02 
{
 public static void main(String args[])
 { int sum=0;
 Scanner k=new Scanner(System.in);
 System.out.println("Enter the size of array");
 int n=k.nextInt();
 int adil[]=new int[n];
 System.out.println("enter "+n+" elements of array");
 for(int i=0;i<adil.length;i++)
 {
 adil[i]=k.nextInt();
 sum=sum+adil[i];
 }
 double avk=sum;
 System.out.println("Required average is="+(avk/n));
 
 }
}
