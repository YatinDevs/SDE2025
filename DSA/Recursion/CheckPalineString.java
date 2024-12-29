package Recursion;
import java.util.*;

//Input: Str =  “ABCDCBA”
//Output: Palindrome

public class CheckPalineString {
    
	public static boolean checkPalindrome1(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			
			char l = str.charAt(left);
			char r = str.charAt(right);
			
			if(!Character.isLetterOrDigit(l)) {
				left++;
			}else if(!Character.isLetterOrDigit(r)) {
				right--;
				
			}else if(Character.toLowerCase(l) != Character.toLowerCase(r)) {
				return false;
			}else {
				left++;
				right--;
			}
			
		}
		return true;
	}
	
	
	// Time Complexity:  O(N)
 
    // Space Complexity: O(1)
	
	
	// Recursive Approachq
	public static boolean checkPalindrome(int i,String str) {
		
		if(i>=str.length()/2) return true;
		  
		if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
		
		 return checkPalindrome(i+1,str);
          
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str = "ABCDCBA";
		    boolean ans = checkPalindrome(0,str);

		    if (ans == true) {
		      System.out.println("Palindrome");
		    } else {
		      System.out.println("Not Palindrome");
		    }
	}

}
