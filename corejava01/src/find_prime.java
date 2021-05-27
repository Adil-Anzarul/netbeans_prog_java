/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class find_prime 
{
    public static void main(String args[])
    {
    int j, n,flag=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no ");
    n=sc.nextInt();
    for(int i=2;i<=n;i++)
    {
   flag=0;
    for(j=2;j<=i/2;j++)
    {
    if(i%j==0)
    {
    flag=1;
    break;
    }
    }
    if(flag==0)
    System.out.println(i);
    }
    }
    
}
