import java.io.*;
import java.util.*;
class NonRepeatele
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n,count=0,i,j;
System.out.println("enter no of elements u wnat to store");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter array elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("non repeating elements are:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i]==a[j])
{
count++;
}
}
if(count==1)
{
System.out.println(a[i]);
}
count=0;
}
}
}
