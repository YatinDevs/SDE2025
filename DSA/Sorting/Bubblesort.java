package Sorting;
import java.util.*;

public class BubbleSort {
    
	public static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
	// 0 - n-1
	// 0 - n-2
	// 0 - n-3
	public static void bubbleSort(int arr[],int n) {
		
		for(int i = n-1 ; i >=0 ; i--) {
			
			boolean isSwapped = false;
			
			for(int j = 1 ; j <= i; j++ ) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					isSwapped = true;
 				}
			}
			
			if(!isSwapped) {
				break;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
		     int n = arr.length;
		     
		     System.out.println("Before Sort: " + Arrays.toString(arr));
		     bubbleSort(arr,n);
		     System.out.println("After Sort: " + Arrays.toString(arr));
	}

}
