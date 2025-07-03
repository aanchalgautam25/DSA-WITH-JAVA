import java.util.Arrays;
import java.util.Scanner;
public class Left_Rotate_Array_Optimal
{
public static void reverse(int[] arr,int start ,int end)
{           while(start<end)
	{
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
	}
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of positions to rotate left: ");
    int d = sc.nextInt();
    
	int[] arr = {1,2,3,4,5,6,7};
    int n = arr.length;
    int k = d%n;
	reverse(arr,0,k-1);
	reverse(arr,k,n-1);
	reverse(arr,0,n-1);
	System.out.println(Arrays.toString(arr));
	
    
 
 
 }
  
 }