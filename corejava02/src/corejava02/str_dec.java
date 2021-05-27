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
public class str_dec 
{
    public static void main(String args[])
    {
    String str=new String("adil");
    String str2=new String();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a name");
    str2=sc.nextLine();
    System.out.println(str+str2);
   /* String s=String.valueOf(2546);
    System.out.println("s="+s);*/
    String s;
    System.out.println("enter a name again");
    s=sc.nextLine();
    System.out.println("enter name is= "+s +" and its length is= "+s.length());
    System.out.println(s.charAt(3));
    String a=s.substring(3);
    System.out.println(a);
    String b=s.substring(3,5);
      System.out.println(b);
    }
    
}
