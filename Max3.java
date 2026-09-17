import java.io.*;
import java.util.*;
class Max3
{
public static void main(String[] args)
{
int a ,b,c;
Scanner o=new Scanner(System.in);
System.out.println("enter the values of a,b,c:");
a=o.nextInt(); 
b=o.nextInt(); 
c=o.nextInt(); 
if(a>b && a>c)
{
System.out.println("a is greatest of b and c");
}
else if(b>c && b>a)
{
System.out.println("b is greatest of a and c");
}
else if(c>a &&c>b)
{
System.out.println("c is greatest of a and b");
}
else if(a==b && b==c)
{
System.out.println("a b c are equal");
}
else if(a==b && a>c)
{
System.out.println("a and b are greatest numbers");
}
else if(a==c && a>b)
{
System.out.println("a and c are greatest numbers");
}
else if(c==b && b>a)
{
System.out.println("b and c are greatest numbers");
}
}
}
