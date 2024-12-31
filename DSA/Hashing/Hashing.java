package Hashing;
import java.util.*;

public class Hashing {
    // Hashing | Maps | Time Complexity | Collisions | Division Rule of Hashing
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Count Number of Frequency for Particular element
		
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		// 5 
		// 1 3 2 1 3
		
		// Pre Compute : 
		
		int hash[] = new int[13];
		for(int i =0;i<n; i++) {
			// hash [ arr[0]] --> 1
			// hash[arr[i]] = 0 + 1;
			hash[arr[i]] = hash[arr[i]]+ 1;
		}
		
		 int q;
	        q = sc.nextInt();
	        while (q-- != 0) {
	            int number;
	            number = sc.nextInt();
	            // fetching:
	            System.out.println(hash[number]);
	        }
	}

}
