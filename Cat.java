import java.io.*;
import java.util.*;
public class Cat
{
String name;
int age;
Cat()
{
this.name="Unknown";
this.age=0;
System.out.println("the cat name and age is:"+name+"\t"+age);
}
public static void main(String[] args)
{
Cat a=new Cat();
}
}
