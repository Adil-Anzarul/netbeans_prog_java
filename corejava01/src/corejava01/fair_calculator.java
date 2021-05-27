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
public class fair_calculator 
{
    public static void main(String args[])throws IOException
    {
  double  n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER DISTANCE");
    n=Double.parseDouble(br.readLine());
    System.out.println("YOUR FAIR IS");
    if(n<=10)
        System.out.println(""+5*n);
    else if(n>10&& n<=25)
        System.out.println(100+3*n);
    else if(n>25 && n<=50)
        System.out.println(200+2*n);
    else if(n>50)
        System.out.println(250+1.5*n);
    }
    
}
