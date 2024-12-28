package Basic;
import java.util.*;

public class ArmstrongNumber {
   /*
    
    Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

    An Amrstrong number is a number that is equal to the sum of its own digits each raised to 
    the power of the number of digits.

    */
	
	public static boolean isArmStrongNumber(int n) {
		
		int count = String.valueOf(n).length();
		int sum = 0;
		int originalNum = n;
		
		while(n > 0) {
			
			int lastDigit = n % 10;
			sum  += Math.pow(lastDigit,count);
			n = n/10;
		}
		
		return sum == originalNum ? true : false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 153;
        if (isArmStrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
	}

}
