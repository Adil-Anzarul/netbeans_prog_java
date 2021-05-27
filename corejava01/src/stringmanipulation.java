/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
import java.lang.*;
public class stringmanipulation 
{
    public static void main(String args[])
    {
    StringBuffer str=new StringBuffer("Object language");
    System.out.println("original string= "+str);
    int p;
    //System.out.println("");
    for(int i=0;i<str.length();i++)
    {
    p=i+1;
    System.out.println("Character at position  "+p+" is "+str.charAt(i));
    }
    String astring=new String(str.toString());
    int pos=astring.indexOf("language");
    str.insert(pos,"oriented");
    System.out.println("modified string is= "+str);
    str.insert(16," "); 
    System.out.println(" string  now is= "+str);
    str.append("improved security");
    System.out.println(" appended string is= "+str);
    }
    
}
