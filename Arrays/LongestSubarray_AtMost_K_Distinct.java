import java.util.*;

public class LongestSubarray_AtMost_K_Distinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;

        int left = 0, right = 0, maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (right < arr.length) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {
                int freq = map.get(arr[left]);
                if (freq == 1)
                    map.remove(arr[left]);
                else
                    map.put(arr[left], freq - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        System.out.println("Longest subarray with at most " + k + " distinct elements: " + maxLength);
    }
}
