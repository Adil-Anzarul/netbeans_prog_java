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

class Rectangl {

    Scanner sc = new Scanner(System.in);
    int length, breadth;

    void input() {
        System.out.println(" enter length and breadth of rectangle");

        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    void display() {
        System.out.println(" length = " + length);
        System.out.println(" breadth = " + breadth);
    }
}

class Rectcolor extends Rectangl {

    Scanner sc = new Scanner(System.in);
    String color;

    void input() {
        super.input();
        System.out.println("Enter colour of rectangle");
        color = sc.nextLine();
    }

    void display() {
        super.display();
        System.out.println("colour = " + color);
    }
}

class area01 extends Rectcolor {

    int area;

    void input() {
        super.input();
    }

    void display() {
        super.display();
    }

    void area() {
        System.out.println("Area = " + (super.length * super.breadth));
    }
}

class areademo {

    public static void main(String args[]) {
        area01 A = new area01();
        A.input();
        A.display();
        A.area();

    }
}