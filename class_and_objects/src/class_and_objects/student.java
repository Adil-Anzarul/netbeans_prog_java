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
class Student 
{
    String name ,school , degree ;
    Scanner sc=new Scanner(System.in);
    void input()
    {
    System.out.println("Enter name");
    name=sc.nextLine();
    System.out.println("enter your school name");
    school=sc.nextLine();
    System.out.println("name of degree");
    degree=sc.nextLine();
    }
    void display()
    {
    System.out.println(" Name = "+name);
    System.out.println("School = "+school);
    System.out.println("Degree = "+degree);
    }
    
}



class Employee extends Student
{
String eid;
int salary;
void input()
{
Scanner ob=new Scanner(System.in);
System.out.println(" enter eid");
eid=ob.nextLine();
System.out.println(" enter salary");
salary=ob.nextInt();
}
void display()
{
System.out.println(" Eid and Salary are  \n= "+eid+" \n "+salary);
}
}
/*
class Emyloyeedemo
{
public static void main(String args[])
{
Employee a=new Employee();
a.input();
a.display();
}
}*/

class Manager extends Employee
{
Scanner sc=new Scanner(System.in);
String tital;
int dues;

void input()
{
System.out.println("Enter tital");
tital=sc.nextLine();
System.out.println("Enter dues");
dues=sc.nextInt();
super.input();
}

void display()
{
System.out.println("Tital = "+tital);
System.out.println(" Dues ="+dues);
super.display();
}
}

class managerdemo
{
public static void main(String args[])
{
Manager a=new Manager();
a.input();
a.display();
}
}
