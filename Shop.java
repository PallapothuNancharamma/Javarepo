import java.io.*;
import java.util.*;
class Shop
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Scanner so=new Scanner(System.in);
  System.out.println("enter the no. of dresses "); 
   int i,n,d,j;
    n=so.nextInt();
    int amount=1;
    String a[]=new String[n];
    int b[]=new int[n];;
    System.out.println("enter the dresses names");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextLine();
    }
    System.out.println("enter the cost of dresses "); 
    for(i=0;i<n;i++)
    {
        b[i]=so.nextInt();
    }
    System.out.println("enter the no.of dresses you want to buy");
    d=so.nextInt();
    String c[]=new String[d];
    System.out.println("enter the name of the dresses");
    for(i=0;i<d;i++)
    {
     a[i]=sc.nextLine();
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
    {
        if(a[i]==c[i])
        {
            amount=amount*b[i];
           
        } 
    }
    }
    System.out.println("the total amount of shopping is:"+amount);
}
}