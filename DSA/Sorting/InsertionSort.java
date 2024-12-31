package Sorting;
import java.util.*;

public class InsertionSort {
	public static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int arr[],int n) {
		
		for(int i = 0 ; i <= n-1; i++ ) {
			
			int  j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--; 
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 9, 4, 7, 6, 3, 11, 5 };
	     int n = arr.length;
	     
	     System.out.println("Before Sort: " + Arrays.toString(arr));
	     insertionSort(arr,n);
	     System.out.println("After Sort: " + Arrays.toString(arr));
	}

}
