/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class choice 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a,b,ch,i;
    do{
        i=0;
    System.out.println("ENTER TWO NUMBER");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("press \n 1-add \n 2-sub \n 3-mul \n 4-div");
    ch=sc.nextInt();
    switch (ch)
    {
         case 1:
            System.out.println(""+a+b);
            break;
         case 2:
            System.out.println(""+(a-b));
            break;
         case 3:
            System.out.println(""+a*b);
            break;
         case 4:
            System.out.println(""+a/b);
            break;
         default:
            System.out.println("invalid choice");
    }
    System.out.println("press 99 to do again");
    i=sc.nextInt();
    }while(i==99);
    }
    
}
