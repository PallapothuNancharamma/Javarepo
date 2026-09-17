import java.io.*;
import java.util.*;
class A
{
int add(int a,int b)
{
return(a+b);
}
final int c=10;
}
class thes 
{
public static void main(String[] args)
{
A s=new A();
System.out.println(s.add(10,20));
System.out.println(s.c);
}
}