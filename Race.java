import java.io.*;
import java.util.*;
class Race
{
public static void main(String[] args)
{
float s1,s2,s3,s4,s5;
System.out.println("enter the speed of the first racer");
Scanner s=new Scanner(System.in);
s1=s.nextFloat();
System.out.println("enter the speed of the second racer");
s2=s.nextFloat();
System.out.println("enter the speed of the third racer");
s3=s.nextFloat();
System.out.println("enter the speed of the four racer");
s4=s.nextFloat();
System.out.println("enter the speed of the fifth racer");	
s5=s.nextFloat();
float average=(s1+s2+s3+s4+s5)/5;
if(s1>average)
{
System.out.println("first racer is qualified "+s1);
}
if(s2>average)
{
System.out.println("second racer is qualified "+s2);
}
if(s3>average)
{
System.out.println("third racer is qualified "+s3);
}
if(s4>average)
{
System.out.println("fourth racer is qualified "+s4);
}
if(s5>average)
{
System.out.println("fifth racer is qualified "+s5);
}
else
{
System.out.println("no racer should be qualified");
}
}
}