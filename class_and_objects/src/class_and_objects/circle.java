
package class_and_objects;


import java.util.Scanner;
class Circle 
{
    double pie;
    double radius;
    
    Circle()
    {
    pie =3.14;
    radius=0;
    }
    
    void input( )
    {
    System.out.println(" enter radius of circle");
    Scanner sc=new Scanner(System.in);
    
    radius=sc.nextDouble();
    }
    void display()
    {
    System.out.println(" radius= "+radius+"\n pie = "+pie);
    }
    double area()
    {
    return(pie*radius*radius);
    }
    double perimeter()
    {
    return(2*pie*radius);
    }
}

class Circledemo
{
public static void main(String args[])
{
Circle c=new Circle();
c.display();
c.input();
c.display();
System.out.println("Area = "+c.area()+" \n perimeter= "+c.perimeter());

}
}
