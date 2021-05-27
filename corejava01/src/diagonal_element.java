/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;

public class diagonal_element {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][], m, n, sum = 0;
        System.out.println("enter no. of rows");
        m = sc.nextInt();
        System.out.println("enter no of column");
        n = sc.nextInt();
        a = new int[m][n];
        System.out.println("enter elements of array");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        if (m == n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == i) {
                        sum += a[i][i];
                    }
                }
            }

            System.out.println("sum of diagonal elements is= " + sum);
        } else {
            System.out.println("not a square matrix");
        }
    }
}
