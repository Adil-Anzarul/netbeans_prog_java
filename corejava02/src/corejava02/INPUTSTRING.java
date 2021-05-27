/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava02;

/**
 *
 * @author pc
 * 
 */
//import java.lang.*;
import java.lang.String;
import java.util.Scanner;

public class INPUTSTRING {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        System.out.println("enter three name");
        s1 = sc.nextLine();
        s1 = s1.trim();
        s2 = sc.nextLine();
        s2 = s2.trim();
        s3 = sc.nextLine();
        s3 = s3.trim();
        /*
        //this code will compare the string on ascii basis 
        //and print the string ehich appear last(which has greater ascii code)
        if(s1.compareTo(s2)>0  && s1.compareTo(s3)>0)
        System.out.println(s1);
        else if(s2.compareTo(s1)>0  && s2.compareTo(s3)>0)
        System.out.println(s2);
        else
        System.out.println(s3); 
        
         */

        /*this code willcompare string on alphabatic basis */
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        s3 = s3.toUpperCase();
        if (s1.charAt(0) < s2.charAt(0) && s1.charAt(0) < s3.charAt(0)) {
            System.out.println(s1);
        } else if (s2.charAt(0) < s1.charAt(0) && s2.charAt(0) < s3.charAt(0)) {
            System.out.println(s2);
        } else {
            System.out.println(s3);
        }





    }
}
