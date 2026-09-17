import java.io.*;
import java.util.*;
class Dress
{
public static void main(String[] args)
{
int i,n,count=0;
String c;
System.out.println("enter the number of dress available in the shop:");
Scanner s=new Scanner(System.in);
Scanner o=new Scanner(System.in);
n=s.nextInt();
String a[]=new String[n];
System.out.println("enter the names of dress available in the shop:");
for(i=0;i<n;i++)
a[i]=o.nextLine();
System.out.println("select one dress from given dresses:");
c=o.nextLine();
for(i=0;i<n;i++)
{
if(c==a[i])
{
count++;
}
}
if(count==1)
{
System.out.println("your dress" +a[i]+ "is selected");
}
else
{
System.out.println("your dress" +a[i]+ "is not selected");
}
}
}
