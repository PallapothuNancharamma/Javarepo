import java.io.*;
import java.util.*;
class PrimeHub
{
public static void main(String[] args)
{
System.out.println("the prime numbers from 100 to 200");             
int i,count=0,j;
for(i=100;i<=200;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{ 
System.out.println(i);
}             
}   
} 
}