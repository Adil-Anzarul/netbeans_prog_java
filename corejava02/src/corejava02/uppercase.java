/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava02;

/**
 *
 * @author pc
 */
//this is to count no. of upper case and lower case letter
import java.util.*;
public class uppercase 
{
    public static void main(String args[])
    {int count1=0,count2=0;
        
    String a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    a=sc.nextLine();
    for(int i=0;i<a.length();i++)
    {
    if(a.charAt(i)>='A' && a.charAt(i)<='Z')
            {
            count1+=1;
            }
    }
    System.out.println("no. of upper case letter is = "+ count1);
     for(int i=0;i<a.length();i++)
    {
    if(a.charAt(i)>='a' && a.charAt(i)<='z')
            {
            count2+=1;
            }
    }
    System.out.println("no. of lower  case letter is = "+ count2);
    
    }
    
}
