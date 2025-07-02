import java.util.HashSet;
import java.util.Collections;
public class Maximum_Consecutive_1s
{
public static void main (String[] args)
{
int arr[] = {1,1,0,1,1,1,0,0,1,1};
HashSet<Integer> set = new HashSet<>();
int count = 0;
for(int i =0;i<arr.length;i++)
 {
   
   if(arr[i] !=0)
   {
   count++;
   
   }
 if(arr[i] == 0 || i == arr.length-1 )
   {
    set.add(count);
	count = 0;
   }
   
   
   

}
        int max = Collections.max(set);
        System.out.println("Maximum value: " + max);


}
}