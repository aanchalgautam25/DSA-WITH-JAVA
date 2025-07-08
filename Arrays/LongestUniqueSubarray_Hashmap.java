import java.util.*;

public class LongestUniqueSubarray_Hashmap {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 5, 2, 3, 4, 1};
		Map<Integer, Integer> map = new HashMap<>();
	    int left =0;
		int right = 0;
		int count =0;
		int maximum =0;
		
		while(right < arr.length)
		{  
		if(!map.containsKey(arr[right]) )
		{
                map.put(arr[right], 1);  // mark presence
                maximum = Math.max(maximum, right - left + 1);
                right++;    
		}
		else
		{
		 map.remove(arr[left]);
		 left++;
		}
		}
		System.out.println("Longest subarray  is: " + maximum);
		
		
		}
}