/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */
 class Sum 
 {
     static float add(float a,float b)
     {
     return(a+b);
     }
     
     static double add(double a, double b)
     {
     return(a+b);
     }
     public static void main(String args[])
     {
     float c=add(2.5f,3.5f);
     double d=add(3.12d,5.4d);
     System.out.println(" float sum = "+c);
     System.out.println("double sum = "+d);
     }
    
}
