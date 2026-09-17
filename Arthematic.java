import java.io.*;
public class Arthematic
{
void show(int a,int b)
{
int c=a+b;
System.out.println("the sum of two numbers is:"+c);
int d=a-b;
System.out.println("the subtraction of a and b is"+d);
int e=a*b;
System.out.println("the multiplication of a and b is:"+e);
int f=a/b;
System.out.println("the division of a and b is:"+f);
int g=a%b;
System.out.println("the modulas of a and b is:"+g);
}
}
class Main
{
public static void main(String[] args)
{
Arthematic o=new Arthematic();
o.show(200,400);
}
}