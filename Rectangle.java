import java.io.*;
import java.util.*;
class Rectangle
{
double width,length,area;
String color;
void set_width(double width)
{
this.width=width;
}
void set_length(double length)
{
this.length=length;
}
void set_color(String color)
{
this.color=color;
}
double find_area()
{
return width*length;
}
}
class Result
{
public static void main(String[] args)
{
double width,length,area;
String color;
Scanner s=new Scanner(System.in);
Scanner s1=new Scanner(System.in);
Rectangle ob1=new Rectangle();
Rectangle ob2=new Rectangle();
System.out.println("enter the length of the first rectangle");
length=s.nextDouble();
System.out.println("enter the width of the first rectangle");
width=s.nextDouble();
System.out.println("Enter the color of first rectangle:");
color=s1.nextLine();
ob1.set_length(length);
ob1.set_width(width);
ob1.set_color(color);
double v1=ob1.find_area();

double width1,length1,area1;
String color1;
System.out.println("enter the length of the second rectangle");
length1=s.nextDouble();
System.out.println("enter the width of the second rectangle");
width1=s.nextDouble();
System.out.println("Enter the color of second rectangle:");
color1=s1.nextLine();
ob2.set_length(length1);
ob2.set_width(width1);
ob2.set_color(color1);
double v2=ob2.find_area();
System.out.println("the color of first rectangle is: "+color+"\nthe color of second rectangle is: "+color1);
if(v1==v2 && color.equals(color1))
{
System.out.println("matching rectangles");
}
}
}












