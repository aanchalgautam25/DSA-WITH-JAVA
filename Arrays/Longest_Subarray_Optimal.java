
public class Longest_Subarray_Optimal
{
public static void main(String[] args)
{
int[] arr = {1,2,3,1,1,1,1,4,2,3};
int k=3;
int left =0;
int right=0;
int count=0;
int maximum =0;
int sum =0;

while(right < arr.length)
{ 
sum = sum+arr[right];

while(sum > k)
{
sum = sum - arr[left];	
left++;
}
if(sum == k)
    {
   count = right-left+1;
   maximum = Math.max(maximum,count);
    }
right++;

}

 System.out.println("Longest subarray with sum " + k + " is: " + maximum);
}
}
