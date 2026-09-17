import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String[] args)
{
int n,res=0,r,temp;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of n:");
n=s.nextInt();
temp=n;
while(n>0)
{
r=n%10;
res=(res*10)+r;
n=n/10;
}
if(temp==res)
{
System.out.println(+n+ "is a palindrome");
}
else
{
System.out.println("Is not a palindrome");
}
}
}