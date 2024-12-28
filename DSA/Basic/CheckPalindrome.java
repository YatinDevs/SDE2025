package Basic;
import java.util.*;

public class CheckPalindrome {
	
	public static boolean isPalindrome(int n) {
		
		int numToCheck = n;
		int revNum = 0;
		
		while(numToCheck > 0) {
			
			// Extract last digit 
		     int lastDigit = numToCheck % 10;
		     revNum = revNum * 10 + lastDigit;
		     numToCheck = numToCheck / 10; // decrement
		     
		}
		
		if( n == revNum) {
			return true;
		}else {
			return false;
		}
	}
    
	// For Numbers to Check Palindrome with two pointer technique .
	public static boolean isPalindromeNumber(int n) {
		
		if(n < 0) {
			return false;
		}
		
		int originalNum = n;
		int reverseNum = 0;
		
		while(n > 0) {
			int lastdigit = n % 10;
			reverseNum = reverseNum * 10 + lastdigit;
			n = n/10;
		}
		
		return originalNum == reverseNum;
	}
	
    // For String to Check Palindrome with Two pointer Technique
	public static boolean isPalindromeString(String str) {
		
	      // Remove whitespace and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s+", "").toLowerCase();
        

        int left = 0;
        int right = str.length() - 1;
		
        while (left < right) {
        	 if (str.charAt(left) != str.charAt(right)) {
                 return false; // Not a palindrome
             }
        	 left++; // Move left pointer to the right
             right--; // Move right pointer to the left
		}

        return true; // It's a palindrome
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // Check whether Number as well as string isPalindromeNumber or not
		
		 int number = 4334;

	        if (isPalindromeNumber(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	        
	        String input1 = "madam";
	        String input2 = "hello";
	        String input3 = "A man a plan a canal Panama"; // Palindrome ignoring case and spaces

	        // Check each string
	        System.out.println("\"" + input1 + "\" is a palindrome: " + isPalindromeString(input1));
	        System.out.println("\"" + input2 + "\" is a palindrome: " + isPalindromeString(input2));
	        System.out.println("\"" + input3 + "\" is a palindrome: " + isPalindromeString(input3));
		
	}

}
