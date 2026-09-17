import java.io.*;
import java.util.*;
class Factorial
{
public static void main(String[] args)
{
int n,i,result=1;
Scanner o=new Scanner(System.in);
System.out.println("enter the value of n:");
n=o.nextInt();
for(i=1;i<=n;i++)
{
result=result*i;
}
System.out.println("the factorial of" +n+ "is:" +result);
}
}