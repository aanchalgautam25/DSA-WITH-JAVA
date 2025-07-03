import java.util.Arrays;
import java.util.Scanner;
public class Left_Rotate_Array
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of positions to rotate left: ");
    int d = sc.nextInt();
    
	int[] arr = {1,2,3,4,5,6,7};
    int n = arr.length;
    int k = d%n;
    
 
 while(k != 0)
 {
  int temp = arr[0];
  for( int i=1 ; i< n; i++)
  {
  arr[i-1] = arr[i];
  }
  arr[n-1] = temp;
  
  k--;
  
 }
 System.out.println(Arrays.toString(arr));
 }
 }
  
 