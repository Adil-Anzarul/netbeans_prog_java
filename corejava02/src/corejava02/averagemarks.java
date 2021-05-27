/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava02;

/**
 *
 * @author pc
 */
//import java.lang.String;
import java.util.Scanner;
public class averagemarks 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the no. of students");
    int n=sc.nextInt();
    String name[]=new String[n];
    int marks1[]= new int[n]; 
    int marks2[]= new int[n]; 
    int marks3[]= new int[n];
    double avg[]=new double[n];
    for(int i=0;i<name.length;i++)
    {
    System.out.println("enter name");
    name[i]=ob.nextLine();
    System.out.println("Enter marks of 3 subjects");
    marks1[i]=sc.nextInt();
    marks2[i]=sc.nextInt();
    marks3[i]=sc.nextInt();
    avg[i]=(marks1[i]+marks2[i]+marks3[i])/3;
    }
    
    for(int i=0;i<name.length;i++)
    {
    System.out.println("Average marks obtained by "+name[i]+" is = "+avg[i]);
    }
    
    }
    
}
