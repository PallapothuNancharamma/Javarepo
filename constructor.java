class constructer
{
public void display(int a,int b)
{
System.out.println("the value of a is:"+a);
System.out.println("the value of b is:"+b);
}
}
class constructor
{
public static void main(String[] args)
{
constructer a=new constructer();
a.display(100,200);
}
}