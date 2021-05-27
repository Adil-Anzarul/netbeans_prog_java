/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class array10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if ((i + 1) % 2 == 0 && a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println("Required sum = " + sum);
    }
}
