package Arrays;
import java.util.*;

public class LargestElementInArr {
	// 1. Using Sorting 
	
	 static int sort(int arr[]) {
		    Arrays.sort(arr);
		    return arr[arr.length - 1];
	}
	// 2. Using max Variable 
	
	
	public static int findLargestElement(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		for(int i = 0 ;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr2[] =  {8,10,5,7,9};
		  System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
		  // Time Complexity: O(N)
          // Space Complexity: O(1)
	}

}
