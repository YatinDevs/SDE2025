package Revision;
import java.util.*;

public class RemoveDuplicatesFromSortedArr {
    
	public static int removeDuplicates(int arr[]) {
		int i = 0;
		int n = arr.length;
		for(int j = 1;j<n;j++) {
			 if(arr[i] != arr[j]) {
				 i++;
				 arr[i] = arr[j];
			 }
		}
		return i + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
