
public class Longest_Subarray_Brute
{
public static void main(String[] args)
{
int[] arr = {1,2,3,1,1,1,1,4,2,3};
int k=3;
int count=0;
int maximum =0;

for(int i =0; i<arr.length; i++)
{ 
  int sum=0;
  for(int j=i; j<arr.length; j++)
  {
  sum = sum + arr[j];
  if(sum == k)
  {
   count = j-i+1;
   maximum = Math.max(maximum,count);
  }
  if(sum > k)
  {
  break;
  }
 }
}
 System.out.println("Longest subarray with sum " + k + " is: " + maximum);
}
}
