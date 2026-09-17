import java.util.*;
class Node
{
int data;
Node prev;
Node next;
Node(int data)
{
this.data=data;
prev=null;
next=null;
}
}
class Linkedlist
{
public static void main(String[] args)
{
Node first=new Node(10);
Node second=new Node(20);
Node third=new Node(30);
Node four=new Node(40);
first.next=second;
second.prev=first;
second.next=third;
third.prev=second;
third.next=four;
four.prev=third;
Node temp=first;
while(temp!=null)
{
System.out.print(temp.data);
if(temp.next!=null)
{
System.out.print("<->");
}
temp=temp.next;
}
System.out.println();
}
}