package Sorting;
import java.util.*;

public class SelectionSort {
    
	public static void printArray(int arr[]) {
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0 ; i < n-1;i++) {
			int min = i;
			for(int j = i + 1 ; j < n;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp  = arr[i]; 
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] = {13,46,24,52,20,9};
           printArray(arr);
           selectionSort(arr);
           printArray(arr);

	}

}
