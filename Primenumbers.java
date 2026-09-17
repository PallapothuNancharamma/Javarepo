import  java.io.*;
import java.util.*;
class Primenumbers
{
public static void main(String[] args)
{
int n,count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the n value:");
n=s.nextInt();
System.out.println("the "+n+":");
for(int i=1;i<=n;i++)
{
int d=i%2;
  if(d==0)
   {
    count++;
   }
} 
if(count==2)
{
     System.out.println("the" +n+ "is a prime number");
}
   else
  {
    System.out.println("the" +n+ "is not a prime number");
   }
}
}