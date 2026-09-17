/*import java.io.*;
import java.util.*;
class Area
{
int l;
int b;
int h;
double r;
double circle(double radius)
{
this.r=radius;
return 3.145*r*r;
}
int rectangle(int length,int bredth,int height)
{
this.l=length;
this.b=bredth;
this.h=height;
return l*b*h;
}
}
class Areas
{
public static void main(String[] args)
{
Area a=new Area();
Scanner s=new Scanner(System.in);
int l,b,h;
double r;
System.out.println("entyer length,bredth,height:");
l=s.nextInt();
b=s.nextInt();
h=s.nextInt();
System.out.println("Enter radius of a circle:");
r=s.nextDouble();
System.out.println("Area of Circle:"+(a.circle(r)));
System.out.println("Area of Rectangle:"+(a.rectangle(l,b,h)));
}
}
*/




/*

import java.util.*;
class Areas
{
public static void main(String[] args)
{
int s;
int temp;

int rem=0;
int result=0;
Scanner o=new Scanner(System.in);
System.out.println("Enter String:");
s=o.nextInt();
temp=s;
while(s>0)
{
rem=s%10;
result=result*10+rem;
s=s/10;
}
if(temp==result)
{
System.out.println("given string is a palindrome");
}
else
{
	System.out.println("given String is not a palindrome");
}
}
}
*/





/*

import java.util.*;
class Areas
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str;
System.out.println("enter the String:");
str=s.nextLine();
String res="";
for (int i=str.length()-1;i>=0;i--)
{
res=res+str.charAt(i);
}
if(str.equals(res))
{
System.out.println("given string is a palindrome");
}
}
}
*/

/*

import java.io.*;
import java.util.*;
class Areas
{
public static void main(String[] args)
{
String str;
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
str=s.nextLine();
String temp="";
for(int i=str.length()-1;i>=0;i--)
{
temp=temp+str.charAt(i);
}
System.out.println("reverse of a string is:"+temp);
if(str.equals(temp))
{
System.out.println("given String is a palindrome " +temp);
}
}
}
*/




/*
import java.io.*;
import java.util.*;
class Areas
{
public static void main(String[] args)
{
int fact=1;
Scanner s=new Scanner(System.in);
System.out.println("enter the factorial of a number:");
int n=s.nextInt();
while(n>0)
{
fact=fact*n;
n--;
}
System.out.println("the factorial of a "+n+ " is "+fact);
}
}
*/



/*
import java.util.*;
class Areas
{
public static void main(String[] args)
{
int a=30;
System.out.println(a+10);
}
}
*/





import java.util.*;
class Areas
{
public static void main(String[] args)
{
int a=10;
int b=20;
int temp;
temp=a;
a=b;
b=temp;
System.out.println(a+" "+b);
}
}
















































































