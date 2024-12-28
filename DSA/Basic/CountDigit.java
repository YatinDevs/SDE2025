package Basic;
import java.util.*;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        // Basic Math Concept 
		// Problem Statement: Given a positive integer N, print the digits of N separately.


		
		 // Extraction of Digits .
        ArrayList<Integer> ans = new ArrayList<>();

	   int N = 7789; 
	   int count = 0;
	   
	   while(N > 0) {
		      
			int lastDigit = N % 10;
			count = count + 1;
            ans.add(lastDigit); 

			N = N / 10;

	   }
	   
	   // Time Complexity  -- > O(log10(N))
	   // when ever there is division  we say log base 10 (N) .
	   // Number of iteration is dependent on number of divison so we say log to base N.
	   
       Collections.reverse(ans);  

	   System.out.println("Number of Digits in are : "  + count);
	   System.out.print("Extracted Digits: ");
       for(int num : ans){
           System.out.print(num + " ");
       }
       System.out.println();
	}

}
