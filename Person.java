import java.io.*;
import java.util.*;
class Person
{
int age;
String Name;
Person(int age,String Name)
{
this.age=age;
this.Name=Name;
}
void display()
{
System.out.println(Name);
System.out.println(age); 
}
}
class P
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Scanner s1=new Scanner(System.in);
int a,a1;
String N,N1;
System.out.println("enter the name of first person:");
N=s.nextLine();
System.out.println("enter the age of first person:");
a=s1.nextInt();

System.out.println("enter the name of second person:");
N1=s.nextLine();
System.out.println("enter the age of second person:");
a1=s1.nextInt();

Person ob1=new Person(a,N);
System.out.println("name and age of first person");
ob1.display();
Person ob2=new Person(a1,N1);
System.out.println("name and age of second person");
ob2.display();
}
}
