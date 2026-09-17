/*
import java.util.*;
import java.io.*;
class Recur
{
public static void main(String[] args)
{
int n,i;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
A o=new A();
System.out.println(o.add(a,n));
}
}
class A
{
int i;
Map<Integer,Integer> map=new HashMap<>();
Map<Integer,Integer> add(int[] b,int n)   //function
{
for(i=0;i<n;i++)
{
map.put(i,b[i]);
}
System.out.println(map.containskey(2));
return map;
}
}
*/
import java.io.*;
import java.util.*;
class Recur
{
public static void main(String[] args)
{
int i,n;
Map<Integer,Integer> map=new HashMap<>();
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
A o=new A();
System.out.println(o.add(a,map,n));
}
}



class A
{
Map<Integer,Integer> add(int a[],Map<Integer,Integer> m,int n)
{
int i;
for(i=0;i<n;i++)
{
m.put(i,a[i]);
}
if(m.containsKey(2))
{
System.out.println("it contains index");
}
if(m.containsValue(10))
{
System.out.println("it contains value 10");
}
return m;
}
}














