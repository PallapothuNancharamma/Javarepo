import java.io.*;
import java.util.*;
class Linear
{
public static void main(String[] args)
{
int n,i,a[];
boolean flag=false;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n:");
n=s.nextInt();
 a=new int[n];
System.out.println("enter the" +n+ "array values:");
for(i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("enter the search value:");
int se=s.nextInt();
for(i=0;i<n;i++)
{
if(se==a[i])
{
flag=true;
}
}
if(flag==true)
{
System.out.println("search element"+se+ "is found at location" +i);
}
else
{
System.out.println("search element"+se+ "is not found");
}
}
}