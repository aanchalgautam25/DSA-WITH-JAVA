import java.util.Arrays;

public class SingleNumber_SortingApproach
 {
    public static void main(String[] args) {
        int arr[] = {5,1,3,7,3,4,5,4,7};
        Arrays.sort(arr);

        int unique = 0;

        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] != arr[i + 1]) {
                unique = arr[i];
                break;
            }
            i += 2;
        }

        // If loop ends and last element was unique
        if (unique == 0 && i == arr.length - 1) {
            unique = arr[i];
        }

        System.out.println("Unique number is: " + unique);
    }
}
