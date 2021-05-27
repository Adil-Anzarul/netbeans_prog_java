/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class wrapperclass {

    public static void main(String[] ar) {
        int i = 5;
        double d = 2.54d;
        float f = 2.54f;
        Integer ic = new Integer(i);
        Double dc = new Double(d);
        Float fc = new Float(f);

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Integer i2 = Integer.valueOf(s);   //String is passed asan argument .it is stored as integer is i2
        Double d2 = Double.valueOf("3.14");
        int a = Integer.parseInt("123");   //String is passed asan argument .it is stored as int a
        double b = Double.parseDouble("12.32");
        int c = i2.intValue(); //convert non primitive to primitive
        for (int j = 0; j < 10; j++) {
            System.out.println("" + c);
            c++;
        }
    }
}
