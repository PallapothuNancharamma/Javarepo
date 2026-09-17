import java.io.*;
import java.util.*;
class BankAccount
{
double initial_amount,deposite_amnt,withdraw_amunt,balance;
BankAccount(double initial_amount,double deposite_amnt,double withdraw_amunt)
{
this.initial_amount=initial_amount;
this.deposite_amnt=deposite_amnt;
this.withdraw_amunt=withdraw_amunt;
}
double deposite()
{
balance=initial_amount+deposite_amnt;
return balance;
}
double withdraw()
{
balance=balance-withdraw_amunt;
return balance;
}
}
class Savings extends BankAccount
{
Savings(double initial_amount,double deposite_amnt,double withdraw_amunt)
{
super(initial_amount,deposite_amnt,withdraw_amunt);
}
double withdraw()
{
super.withdraw();
if(balance<100)
{
System.out.println("Insuffient Funds Minimmum balance of 100$ is required");
}
return balance;
}
}
class Bank
{
public static void main(String[] args)
{
double i,d,w,b;
Scanner s=new Scanner(System.in);
System.out.println("enter the initial balance");
i=s.nextInt();
System.out.println("enter the deposite amount");
d=s.nextInt();
System.out.println("enter the withdraw amount");
w=s.nextInt();
Savings o=new Savings(i,d,w);
System.out.println("after deposite"+(o.deposite()));
System.out.println("after withdraw"+(o.withdraw()));
}
}
