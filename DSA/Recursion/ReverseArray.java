package Recursion;
import java.util.*;


public class ReverseArray {
    
	public static void printArray(int arr[]) {
		
		System.out.println(Arrays.toString(arr));
	}
	
	// Using Extra Array 
	public static void reverseArray1(int arr[],int n) {
		
		int rev[] = new int[n];
		
		for(int i = n-1;i>=0;i--) {
			rev[n-i-1] = arr[i];
		}
		
		printArray(rev);
	}
	// Space Optimized Iterative Approach
	public static void reverseArray2(int arr[],int n) {
		
	  // two pointer
		int p1 = 0;
		int p2 = n-1;
		
		while (p1 < p2) {
			
			int temp = arr[p1];
			arr[p1] = arr[p2];
			arr[p2] = temp;
			p1++;
			p2--;
		}
		
		printArray(arr);
	}
	
	// Recursive Approach (Parameterized Approach)
	
	public static void reverseArray3(int arr[],int start , int end) {
		
		if(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArray3(arr,start+1,end-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {5,4,3,2,1};
      printArray(arr);
//      reverseArray1(arr,arr.length);
//      reverseArray2(arr,arr.length);
      reverseArray3(arr,0,arr.length-1);
      printArray(arr);

	}

}
