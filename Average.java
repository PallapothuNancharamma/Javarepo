import java.io.*;
import java.util.*;
class Average
{
public static void main(String[] args)
{
int n;
long res=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number which is largerthan 9 and lessthan 20:");
n=s.nextInt();

if(n>9&&n<20)
{
for(int i=1;i<=n;i++)
{
res=res*i;
}
System.out.println("the factorial of"+n+"is:"+res);
}
else
{
System.out.println("The entered number is out of range,you have to Enter the number which is largerthan 9 and lessthan 20:");
}
}
}
