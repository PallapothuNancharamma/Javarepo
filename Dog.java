import java.io.*;
import java.util.*;
class Dog
{
String name,color;
Dog(String name,String color)
{
this.name=name;
this.color=color;
System.out.println("the name and age of the dog is:"+name+ "\t" +color);
}
public static void main(String[] args)
{
Dog s=new Dog("sweety","white");

}
}