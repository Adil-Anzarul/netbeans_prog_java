/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class array06 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("enter 10 elements of array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("the minimum value of element is =" + min);
    }
}
