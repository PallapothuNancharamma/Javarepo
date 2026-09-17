import java.io.*;
import java.util.*;
class Swap
{
public static void main(String[] args)
{
int a,b,temp;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of a:");
a=s.nextInt();
System.out.println("enter the value of b:");
b=s.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("after swaping value of a ="+a);
System.out.println("after swaping value of a ="+b);
}
}