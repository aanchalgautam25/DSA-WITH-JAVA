import java.util.*;

public class LongestUniqueSubarray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 5, 2, 3, 4, 1};
		HashSet<Integer> set = new HashSet<>();
	    int left =0;
		int right = 0;
		int maximum =0;
		
		while(right < arr.length)
		{
		  
		      if (!set.contains(arr[right])) {
                set.add(arr[right]);
                maximum = Math.max(maximum, right - left + 1);
                right++;
            } else {
                // Duplicate found → shrink window from left
                set.remove(arr[left]);
                left++;
            }
        
		}
		System.out.println("Longest unique subarray  is: " + maximum);
		
		}
		}