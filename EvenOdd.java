import java.io.*;
import java.util.*;
class EvenOdd
{
public static void main(String[] args)
{
int n,c;
Scanner s=new Scanner(System.in);
System.out.println("enter the n value");
n=s.nextInt();
c=n%2;
if(c==0)
{
System.out.println(+n+ "is a even number");
}
else
{
System.out.println(+n+ "is a odd number");
}
}
}