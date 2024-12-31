package Revision;
import java.util.*;

public class SecondLargestinArray {
    
	public static int findSecondLargest(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		
		int n  = arr.length;
		
		for(int i = 0; i< n;i++) {
			
			if(arr[i] > max) {
				second_max = max;
				max = arr[i];
			}else if(arr[i] > second_max && arr[i] != max) {
				second_max = arr[i];
			}
		}
		return second_max;
	}
	
	 
		public static int findSecondSmallest(int arr[]) {
			
			int small = Integer.MAX_VALUE;
			int second_small = Integer.MAX_VALUE;
			
			int n  = arr.length;
			
			for(int i = 0; i < n;i++) {
				
				if(arr[i] < small) {
					second_small = small;
					small = arr[i];
				}else if(arr[i] < second_small && arr[i] != small) {
					second_small = arr[i];
				}
			}
			return second_small;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] arr = {1, 2, 4, 7, 7, 5};
		
		int sL = findSecondLargest(arr);
		int sS = findSecondSmallest(arr);
		System.out.println("Second largest is "+sL);
		System.out.println("Second smallest is "+sS);

	}

}
