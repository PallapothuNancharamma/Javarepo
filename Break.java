import java.util.*;
import java.io.*;
class Shape
{
public double calculateArea()
{
return 0.0;
}
}
class Circle extends Shape
{
double r;
Circle(double r)
{
this.r=r;
}
public double calculateArea()
{
return 3.14*r*r;
}
}
class Rectangle extends Shape
{
double l,w;
Rectangle(double l,double w)
{
this.l=l;
this.w=w;
}
public double calculateArea()
{
return l*w;
}
}
class Triangle extends Shape
{
double b,h;
Triangle(double b,double h)
{
this.b=b;
this.h=h;
}
public double calculateArea()
{
return 0.5*b*h;
}
}
class Break
{
public static void main(String[] args)
{
double ra,le,wi,br,he;
Scanner s=new Scanner(System.in);
System.out.println("enter radius of a circle");
ra=s.nextInt(); 
System.out.println("enter length of a rectangle");
le=s.nextInt();
System.out.println("enter width of a rectangle");
wi=s.nextInt();
System.out.println("enter base of a Triangle");
br=s.nextInt();
System.out.println("enter height of a Triangle");
he=s.nextInt();
Shape c=new Circle(ra);
Shape r=new Rectangle(le,wi);
Shape t=new Triangle(br,he);
System.out.println("Area of Circle is:"+c.calculateArea());
System.out.println("Area of Rectangle is:"+r.calculateArea());
System.out.println("Area of Triangle is:"+t.calculateArea());
}
}