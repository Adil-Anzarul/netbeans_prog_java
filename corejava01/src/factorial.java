/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class factorial 
{
    public static void main(String args[])
    {char a;
    int n;
    
    Scanner sc=new Scanner(System.in);
    do{
        int pro=1;
    System.out.println("enter a no.");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    pro=pro*i;
    }
    System.out.println(n+"!="+pro);
    System.out.println("press a to do again");
    a=sc.next().charAt(0);
    }while(a=='a' || a=='A');
            }
    
}
