import java.io.*;
import java.util.*;
class Primenum
{
public static void main(String[] args)
{
int n,i,count,c;
count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the n value:");
n=s.nextInt();
for(i=1;i<=n;i++)
{
c=n%i;
if(c==0)
{
count++;
}
}
if(count==2)
{
System.out.println(+n+"is a prime number");
}
else
{
System.out.println(+n+"is not a prime number");
}
}
}