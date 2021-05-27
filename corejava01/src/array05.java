/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class array05 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int posn = 0, ch = -1;
        int a[] = new int[10];
        System.out.println("Enter 10 no. as elements of array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the no. you want to search");
        int n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            posn = 0;
            if (a[i] == n) {//
                posn = 1;
                ch = i;
                System.out.println("yes! the given no. ( " + n + " )  is found in array at position= " + (i + 1));
            }
        }
        if (ch == -1) {
            System.out.println("the given no. is not found");
        }
    }
}
