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
public class name_and_marks 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in); 
    Scanner ob=new Scanner(System.in);
    String name[]=new String[5];
    int marks[]=new int[5];
    for(int i=0;i<marks.length;i++)
    {
    System.out.println("enter name");
    name[i]=sc.nextLine();
    System.out.println("enter marks obtained by "+name[i]);
    marks[i]=ob.nextInt();
    }
    int max=marks[0],posn=0;
    for(int i=0;i<marks.length;i++)
    {
    if(max<marks[i])
    {
        max=marks[i];
        posn=i;
    }
    }
    System.out.println("maximum marks is obtained by "+ name[posn]);
    }
    
}
