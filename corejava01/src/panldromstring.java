/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.lang.*;
import java.util.Scanner;
public class panldromstring 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String m=sc.nextLine();
    String r="";
    for(int i=m.length()-1;i>=0;i--)
    {
    r=r+m.charAt(i);
    }
   
    System.out.println(r);
    if(r.compareTo(m)==0)
        System.out.println(" it is palindrom");
    else
        System.out.println("it is not a palindrom");
    }
    
}
