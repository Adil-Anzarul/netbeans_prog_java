/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
//this is to find maximum value in array
import java.util.Scanner;

public class array07 {

    public static void main(String args[]) {
        int position = 0;
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("enter 10 elements of array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                position = i + 1;
            }
        }
        System.out.println("maximum value in array is =" + array[position - 1]
                + " is found in position= " + position+" th.");

    }
}
