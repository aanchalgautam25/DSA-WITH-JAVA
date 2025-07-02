import java.util.HashMap;

public class FirstNonRepeating_HashMap {

    public static int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating element found
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};  
        int result = firstNonRepeating(arr);

        if (result != -1) {
            System.out.println("First non-repeating index: " + result);
            System.out.println("Element: " + arr[result]);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
