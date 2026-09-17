import java.io.*;
import java.util.*;
class Forloop
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter the n value:");
n=s.nextInt();
System.out.println("the 7th table is:");

for(int i=1;i<=n;i++)
{
System.out.println( "2*"+i+"="+(i*2));
}
}
}