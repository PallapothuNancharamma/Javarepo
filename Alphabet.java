import java.io.*;
import java.util.*;
import java.lang.*;
class Alphabet
{
public static void main(String[] args)
{
int n,i,j,m;
System.out.println("enter the value of n:");
Scanner f=new Scanner(System.in);
Scanner v=new Scanner(System.in);
n=f.nextInt();
String p[]=new String[n];
System.out.println("enter the jumbled alphabets\n p=");
for(i=0;i<n;i++)
p[i]=v.nextLine();
System.out.println("enter the no.ofalphabets in order:");
m=f.nextInt();
String s[]=new String[m];
System.out.println("enter the what the alphabet alphabet order do you want\n s=");
for(j=0;j<m;j++)
s[j]=v.nextLine();
String position[]=new String[m];
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(s[j]==p[i])
{
System.out.println("the"+s[j]);
}
}
}
}
}