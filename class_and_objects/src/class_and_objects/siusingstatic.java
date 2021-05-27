/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */
import java.util.Scanner;

class siusingstatic {

    static double si(double p, double r, double t) {
        double y = (p * r * t) / 100;
        return (y);
    }
}

class demo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n principal \n rate  \n and time");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double a = siusingstatic.si(p, r, t);
        System.out.println("SI =" + a);
    }
}