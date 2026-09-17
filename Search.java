import java.io.*;
import java.util.*;
class Search
{
public static void main(String[] args)
{
int se,i,n,count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the" +n+ "integers:");
for(i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("enter the search element:");
se=s.nextInt();
for(i=0;i<n;i++)
{
if(se==a[i])
{
count++;
}
}
if(count==1)
{
System.out.println("element "+se+ "is found at location" +i);
}
else
{
System.out.println("element "+se+ "is not found");
}
}
}