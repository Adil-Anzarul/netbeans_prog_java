/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */

//not working well
import java.util.Scanner;
import java.lang.String;
public class name 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name");
    String name=sc.nextLine();
    System.out.println("enter your mobile number");
    String no=sc.nextLine();
    StringBuffer u=new StringBuffer("hellow your mobile number is activated");
    String sen=new String(u.toString());
     u.insert(7,name);
     int pos1=6+name.length();
     
    
     sen= u.toString();
     u.insert(pos1+1," "); 
      
     sen=u.toString();
     int pos2=27+name.length();
     u.insert(pos2,no);
     sen=u.toString();
     int pos3=pos2+no.length();
     u.insert(pos3," ");
     System.out.println(u);
    }
    
}
