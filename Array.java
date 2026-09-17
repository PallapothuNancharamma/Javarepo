import java.io.*;
import java.util.*;
class Array
{
public static void main(String[] args)
{
int i,n,Max;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the "+n+ "values");
for(i=0;i<n;i++)
a[i]=s.nextInt();
Max=a[0];
for(i=0;i<n;i++)
{
if(a[i]>Max)
{
Max=a[i];
}
}
System.out.println("the maximum value of given array is:"+Max);
}
}