import java.io.*;
import java.util.*;
class Fact
{
public static void main(String[] args)
{
int fac=1;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
 fac=i*fac;
}
System.out.println("the factorial of"+n+" is:"+fac);
}
}