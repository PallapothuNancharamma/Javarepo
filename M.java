import java.io.*;
import java.util.*;
class M
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i,n;
n=s.nextInt();
String a[]=new String[n];
int b[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextLine();
s.nextLine();
b[i]=s.nextInt();
}
A o=new A();
System.out.println(o.add(a,b,n));
}
}
class A
{
Map <String,Integer> add(String a[],int b[],int n)//function
{
int i;
Map<String,Integer> map=new HashMap<>();
for(i=0;i<n;i++)
{
map.put(a[i],b[i]);
}
Scanner e=new Scanner(System.in);
String c=e.nextLine();
if(map.containsKey(c));
{
System.out.println("map contains key "+c +map.get(c));
}
return map;
}
}