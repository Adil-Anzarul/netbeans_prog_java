/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava01;

/**
 *
 * @author pc
 */
import java.io.*;
public class areaofcircle 
{
    public static void main(String args[])throws IOException
    {
    double r,a=0.0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER RADIUS OF CIRCLE");
    r=Double.parseDouble(br.readLine());
    a=3.14*r*r;
    System.out.println("AREA= "+a);
    }
    
}
