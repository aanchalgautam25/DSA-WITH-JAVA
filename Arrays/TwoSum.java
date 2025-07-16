
public class TwoSum
{
public static void main(String[] args)
{
int[] arr = {2,6,5,8,11};
int target =14;
int sum = 0;
for(int i =0 ; i< arr.length;i++)
{
  if(arr[i] < target)
   {
   sum = target - arr[i]; 
   }
   else
   continue;
   
  for(int j =i+1 ;j<arr.length;j++)
  {
   if(arr[j] == sum)
   {
      System.out.println ("the two elements indices are : "+ i + " and "+ j);
   
   }
   
   
   }
  
  }

}
}