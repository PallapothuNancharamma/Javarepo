import java.io.*;
import java.util.*;
class Li
{
public static void main(String[] args)
{
int n,i,l,f,se,c;
Scanner s=new Scanner(System.in);
System.out.println("enter n:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter array values:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter search element:");
se=s.nextInt();
f=0;
l=n-1;
Binary o=new Binary();
c=o.binary(f,l,a,se);
System.out.println(c);
}
}


class Binary
{
int m;
int binary(int first,int last,int arr[],int search)
{
m=(first+last)/2;
if(first<last)
{
if(arr[m]==search)
{
System.out.println("the search element "+search+" is found");
}
else if(arr[m]>search)
{
last=m-1;
binary(first,last,arr,search);
}
else if(arr[m]<search)
{
first=m+1;
binary(first,last,arr,search);
}
}
if(first>last)
{
System.out.println("the element not found");
}
return search;
}
}


