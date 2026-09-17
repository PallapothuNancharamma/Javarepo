import java.io.*;
import java.util.*;
class Minmax
{
public static void main(String[] args)
{
int i;
Scanner s=new Scanner(System.in);
System.out.println("enter the number values to be stored in array:");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the  values to be stored in array:");
for(i=0;i<n;i++)
a[i]=s.nextInt();
int max=a[0],min=a[0];
for(i=1;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
}
else if(a[i]<min)
{
min=a[i];
}
else
{

}
}
System.out.println("the maximum value of an given array is:"+max);
System.out.println("the minimum value of an given array is:"+min);
}
}
