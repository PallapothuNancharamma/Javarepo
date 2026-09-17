import java.io.*;
import java.util.*;
class Height
{
public static void main(String[] args)
{
int i,j,temp=0,n;
Scanner s=new Scanner(System.in);
Scanner o=new Scanner(System.in);
System.out.println("enter the no.of students in a class:");
n=s.nextInt();
String[] name=new String[n];
System.out.println("enter the student names in a class:");
for(i=0;i<n;i++)
name[i]=o.nextLine();
int[] height=new int[n];
System.out.println("enter the student heights in a class:");
for(j=0;j<n;j++)
height[j]=s.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(height[j]>temp)
{
temp=height[j];
}
}
}
System.out.println("the student is having highest height in class room with" +temp+ "height");
}
}