/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_objects;

/**
 *
 * @author pc
 */
class Adil 
{
    double area=0.0;
    double area(double radius)
    {
    area=(3.14*radius*radius);
    return(area);
    }
    double area(double length,double breadth)
    {
    area=(length*breadth);
    return(area);
    }
    double area(double p1,double p2,double heigth)
    {
    area=(((p1+p2)*heigth)/2);
    return(area);
    }
    void input()
    {
    System.out.println(area);
    }
}

class areademo0
{
public static void main(String args[])
{
Adil a=new Adil();
a.area(10);
a.input();
a.area(2.1,2.1);
a.input();
a.area(1,1,10);
a.input();

}
}
/* method overloading is shwnn */