import java.io.*;
import java.util.Scanner;
class Shapes
{
double width,base,height;
}
class Rectangle extends Shapes
{
Rectangle(double height,double width)
{
this.height=height;
this.width=width;
}
double area()
{
return height*width;
}
}
class Triangle extends Shapes
{
Triangle(double base,double heigth)
{
this.base=base;
this.height=height;
}
double area()
{
return 0.5*base*height;
}
}
class Shape
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
double w,b,h;
System.out.println("enter the width,base,height:"); 
w=s.nextDouble();
b=s.nextDouble();
h=s.nextDouble();
Rectangle ob=new Rectangle(h,w);
double a=ob.area();
System.out.println("The area of Rectangle is:"+a);
Triangle ob1=new Triangle(b,h);
double c=ob1.area();
System.out.println("The area of Triangle is:"+c);
}
}




