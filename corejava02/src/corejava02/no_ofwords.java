/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava02;

/**
 *
 * @author pc
 */
//this is to find no. of words and letters
import java.util.Scanner;

public class no_ofwords {

    public static void main(String args[]) {
        int count = 0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String a = s.trim();
        for (int i = 0; i < a.length(); i++) 
        {
            if (a.charAt(i) != ' ') 
                count += 1;
            if(a.charAt(i) == ' ')
                 c=c+1;
            
            
        }
        System.out.println("no. of letters= " + count);
         System.out.println("no. of words= " + (c+1));
    }
}
