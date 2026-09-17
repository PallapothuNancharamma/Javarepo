import java.util.*;
class DSA1
{
public int[] tosum(int[] nums, int target)
{
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
int temp=target-nums[i];
if(map.containsKey(temp))
{
return new int[]{map.get(temp),i};
}
map.put(nums[i],i);
}
return new int[]{};
}
}
class main
{
public static void main(String[] args)
{
int n,t;Scanner s=new Scanner(System.in);
System.out.println("enter target:");
t=s.nextInt();
System.out.println("enter no of elements to store:");
n=s.nextInt();
int[] num=new int[n];
System.out.println("enter array elements:");
for(int i=0;i<num.length;i++)
{
num[i]=s.nextInt();
}
DSA1 obj=new DSA1();
int[] result=obj.tosum(num,t);
System.out.println(Arrays.toString(result));
}
}