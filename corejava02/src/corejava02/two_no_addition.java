/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava02;

/**
 *
 * @author pc
 */
import java.lang.String;
import java.util.Scanner;
public class two_no_addition 
{
    public static void main(String args[])
    {
   
   Scanner sc=new Scanner(System.in); 
   Scanner ob=new Scanner(System.in);
    //why there is a need to made two objects of scanner class
    int a,b;
     String c="0";
    do{ 
          //  c="no";
            System.out.println("Enter two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("sum= "+(a+b));
            System.out.println("press yes to do again");
            c=ob.nextLine();
    }while(c.equalsIgnoreCase("yes"));   
    }
    
}
