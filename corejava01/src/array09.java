/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;

public class array09 {

    public static void main(String args[]) {
        int a[], n, max, min;
        int j = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        max = a[0];
        min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                j = i;
            }
            if (a[i] < min) {
                min = a[i];
                k = i;
            }
        }
        System.out.println("the diff b/w max and min is=" + (max - min));
        int diff = j - k;
        if (diff < 0) {
            diff = diff * (-1);
        }
        System.out.println("press y if you want to know the diff b/w their positions");
        char d = sc.next().charAt(0);
        if (d == 'Y' || d == 'y') {
            System.out.println("the diff b/w their positions is =" + diff);
        }
    }
}
