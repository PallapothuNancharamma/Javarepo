import java.io.*;
import java.util.*;
public class Student
{
String name,id;
int rank;
Student()
{
name="sruthi";
id="4j3";
rank=7;
}
Student(String name,String id,int rank)
{
this.name=name;
this.id=id;
this.rank=rank;
}
Student(String name,string age)
{

}
public static void main(String[] args)
{
Student s1=new Student();
Student s2=new Student("abhi","5F1",3);
System.out.println("The first student Name is:"+s1.name);
System.out.println("The first student id is:"+s1.id);
System.out.println("The first student rank is:"+s1.rank);
System.out.println("The second student Name is:"+s2.name);
System.out.println("The secondstudent id is:"+s2.id);
System.out.println("The second student rank is:"+s2.rank);
}
}

