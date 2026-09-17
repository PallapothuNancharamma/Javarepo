import java.io.*;
import java.util.*;
class Max
{
public static void main(String[] args)
{
int a,b;
Scanner o=new Scanner(System.in);
System.out.println("enter the values of a and b:");
a=o.nextInt();
b=o.nextInt();
if(a>b)
{
System.out.println("a is larger");
}
else if(a<b)
{
System.out.println("b is larger");
}
else if(a==b)
{
System.out.println("a and b both are equal");
}
}
}