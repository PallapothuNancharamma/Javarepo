import java.io.*;
import java.util.*;
class Duplicate
{
public static void main(String[] args)
{
int n,i,count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter n:");
n=s.nextInt();
int a[]=new int [n];
System.out.println("enter array values:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i]==a[j])
{
count++;
}
}
if(count==1)
{
System.out.print(a[i]);
}
count=0;
}
}
}