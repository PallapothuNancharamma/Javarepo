#include<stdio.h>
int main()
{
int i,sum=0,n;
printf("enter n:");
scanf("%d",n);
for(i=0;i<=n;i++)
{
if((i%2)==0)
{
sum=i*i*i+sum;
}
}
printf("the sum even numbers between 1 to %d is:%d",n,sum);
}