/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class calculatorif01 
{
    public static void main(String args[])
    {
        
    double m;
    int a,b;
    char ch,ob;
    Scanner sc=new Scanner(System.in);
    do{
    System.out.println("enter two no.");
    a=sc.nextInt();
    b=sc.nextInt();
    m=a;
    System.out.println("enter your choice \n  "
            + "A-addition \n S-subtraction \n M-multiplication \n D-division \n R-remainder");
    ch=sc.next().charAt(0);//remaimber it
   /* if(ch=='a' || ch=='A')
        System.out.println(""+a+b);
    if(ch=='b' || ch=='B')
        System.out.println(""+(a-b));
    if(ch=='m' || ch=='M')
        System.out.println(a*b);
    if(ch=='d' || ch=='d')
        System.out.println(m/b);
    if(ch=='r' || ch=='R')
        System.out.println(a%b); */
         //OR
    switch (ch)
    {
        case 'a':
        case 'A':
            System.out.println(a+b);
            break;
        case 's':
        case 'S':
            System.out.println(a-b);
            break;
        case 'm':
        case 'M':
            System.out.println(a*b);
            break;  
        case 'd':
        case 'D':
            System.out.println(m/b);
            break;
        case 'r':
        case 'R':
            System.out.println(a%b);
            break;  
    }
    
    System.out.println("press Y to do again");
    ob=sc.next().charAt(0);
        }while(ob=='Y' || ob=='y');
    }
    
}
