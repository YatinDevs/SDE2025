package Arrays;
import java.util.*;

public class SecondLargestInArray {
    
	public static int secondSmallest(int arr[],int n) {
		
		int small = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		for(int i = 0;i< n;i++) {
			
			if(arr[i] < small) {
				secondSmall = small;
				small = arr[i];
			}else if(arr[i] < secondSmall && arr[i] != small) {
				secondSmall = arr[i];
			}
		}
		
		return secondSmall;
	}
	
public static int secondLargest(int arr[],int n) {
		
		int large = Integer.MIN_VALUE;
		int secondLarge =  Integer.MIN_VALUE;
		for(int i = 0;i < n;i++) {
			
			if(arr[i] > large) {
				secondLarge = large;
				large = arr[i];
			}else if(arr[i] > secondLarge && arr[i] != large) {
				secondLarge = arr[i];
			}
		}
		
		return secondLarge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 7, 7, 5};
		int n = arr.length;
			int sS = secondSmallest(arr, n);
			int sL = secondLargest(arr, n);
		System.out.println("Second smallest is "+sS);
		System.out.println("Second largest is "+sL);
	}

}
