import java.util.*;
import java.io.*;
class Arraylist
{
public static void main(String[] args)
{
ArrayList<String> names=new ArrayList<>();
Scanner s=new Scanner(System.in);
String e;
System.out.println("enter array elements");
for(int i=1;i<=5;i++)
{
e=s.nextLine();
names.add(e);
}
System.out.println("getting the index of 2 "+names.get(2));
System.out.println(names);
System.out.println("removing the index at 3 "+names.remove(3));
System.out.println("size of a list "+ names.size());
System.out.println("contains the element abhi  "+names.contains("abhi"));
names.clear();
System.out.println("checking the list is empty or not "+ names.isEmpty());
}
}
