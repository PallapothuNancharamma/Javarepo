import java.io.*;
import java.util.*;
class Binary
{
public static void main(String[] args)
{
int n,i,se;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n:");
n=s.nextInt();
int[] a=new int[n];
System.out.println("enter the n values:");
for(i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("enter the search value:");
se=s.nextInt();
int l=0,h=n-1,m;
m=(l+h)/2;
while(h>l)
{
if(a[m]==se)
{
System.out.println("the search element" +se+ "is found ");
break;
}
else
{
 if(a[m]<se)
{
 l=m-1;
}
 else
{
h=m+1;
}
}
}
System.out.println("the search element" +se+" is not in a array ");
}
}