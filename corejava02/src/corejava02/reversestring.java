/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava02;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class reversestring 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ener a string");
    String s=sc.nextLine();
    int n=s.length();
    //String rev[]=new String[n];
    for(int i=n-1;i>=0;i--)
    {
       System.out.print(s.charAt(i));
    }
     System.out.print("");
    }
    
}
