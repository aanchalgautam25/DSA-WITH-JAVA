public class FirstNonRepeating_bruteForce {

    // brute-force
    public static int firstNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1; // No non-repeating element found
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};  // Try changing this input
        int result = firstNonRepeating(arr);
        
        if (result != -1) {
            System.out.println("First non-repeating index: " + result);
            System.out.println("Element: " + arr[result]);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
