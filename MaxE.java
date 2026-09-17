import java.io.*;
import java.util.*;
class MaxE
{
public static void main(String[] args)
{
int n,i,Max;
Scanner o=new Scanner(System.in);
System.out.println("enter how many numbers to insert into array:");
n=o.nextInt();
int array[]=new int[n];
System.out.println("enter "+n+" integers:");
for(i=0;i<n;i++)
{
array[i]=o.nextInt();

Max=array[0];
if(Max>array[i])
{
}
else
{
Max=array[i];
System.out.println(+Max);
}
}
}
}