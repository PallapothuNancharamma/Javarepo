import java.io.*;
class Palindrome1
{
public static void main(String[] args)
{
char arr[]={'m','a','d','a','m'};

char r[]=new char[4];
int j=0;
while(j<4)
{
for(int i=3;i>=0;i--)
{
char c=arr[i];
r[j]=c;
j++;
}
}
String a=new String(arr);
String b=new String(r);
System.out.println(a);
System.out.print(b);
String d=a;
String e=b;
if(d==e)
{
System.out.print("palindrome");
}
}
}