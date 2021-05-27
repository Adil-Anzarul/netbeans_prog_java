/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.*;
class userandom 
{
    public static void main(String []ar)
    {
        int i=0;
    Random rc=new Random();
    i=rc.nextInt();
    //System.out.println(i);
    if(i<0)
    { i=i*(-1);}
    
    int dice=i%7;
    if(i%7==0)
        dice=1;
    System.out.println(" you got \n "+dice);
    }
    
}
