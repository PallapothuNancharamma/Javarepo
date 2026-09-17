import java.io.*;
import java.util.*;
class First
{
public static void main(String[] args)
{
int n=10,c=0,t=0;
int a[]=new int[n];
Scanner s=new Scanner(System.in);
System.out.println("enter 10 studentmarks:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int k=a[0];
System.out.println("students who are getting more than 40:");
for(int i=0;i<n;i++)
{
if(a[i]>40)
{
c++;
}
}
System.out.println(c);
System.out.println("students who are getting less than 40:");
for(int i=0;i<n;i++)
{
if(a[i]<40)
{
t++;
}
}
System.out.println(t);
for(int i=0;i<n;i++)
{
if(a[i]>k)
{
k=a[i];
}
}
System.out.println("the highest score from 10 students:"+k);
}
}




