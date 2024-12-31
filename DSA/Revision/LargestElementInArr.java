package Revision;
import java.util.*;

public class LargestElementInArr {
    
	// Find The Largest Element in An Array .
	
	// Problem Statement :  Given an Array, we have to find the largest element in the array.
	
	// 1. Sorting Technique
	
	public static int findLargestElement(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		int n = arr.length - 1;
		for(int i = 0 ; i < n;i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		return max;
	}
	
	// 2. Recursive approach - > Using Max Variable
	
	// Time Complexity : O(N)
	// Space Complexity : O(1)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr1[] = {2,5,1,3,0};
		
		int arr2[] = {8,10,5,7,9};
		
		Arrays.sort(arr1); 
		
//		Time Complexity: O(N*log(N))
//      Space Complexity: O(n)
		
		System.out.println(arr1[arr1.length-1]);
			
		System.out.println(findLargestElement(arr2));

	}

}
