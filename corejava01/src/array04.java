/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class array04 {

    public static void main(String args[]) {
        int ak[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 elements of array");
        for (int i = 0; i < ak.length; i++) {
            ak[i] = sc.nextInt();
        }
        System.out.println("all even numbers from 1st to last is=");
        for (int i = 0; i < ak.length; i++) {
            if (ak[i] % 2 == 0) {
                System.out.println(ak[i]);
            }
        }
        System.out.println("all odd numbers from last to first");
        for (int i = ak.length - 1; i != -1; i--) {
            if (ak[i] % 2 != 0) {
                System.out.println(ak[i]);
            }
        }
    }
}
