import java.io.*;
import java.util.*;
class Secondlarge
{
public static void main(String[] args)
{
int first=0;
int second=0;
int a[]={10,5,8,20,15};
for(int i=0;i<a.length;i++)
{
if(a[i]>first)
{
second=first;
first=a[i];
}
else if(a[i]<first && a[i]>second)
{
second=a[i];
}
}
System.out.println("second largest number in given array:"+second);
}
}