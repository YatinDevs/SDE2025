package Basic;
import java.util.*;


public class CheckPrime {
  // Problem Statement: Given an integer N, check whether it is prime or not. 
  // A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.
	
	
	public static boolean checkPrime(int n) {
		
		int count = 0;
		
		for(int i = 1;i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		
		  if (count == 2) {
	            // Return true, indicating
	            // that the number is prime.
	            return true;
	        } else {
	            // Return false, indicating
	            // that the number is not prime.
	            return false;
	        }
	}
	
	
	public static boolean checkPrimeOptimized(int n) {
		
		int count = 0;
		
		for(int i = 1 ; i * i <= n;i++) {
			
			if(n % i == 0) {
				count++;
				
				if(n/i != i) {
					count++;
				}
			}
		}
		
		if(count == 2) {
			return true;
			
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 14;
	        boolean isPrime = checkPrimeOptimized(n);
	        if (isPrime) {
	            System.out.println(n + " is a prime number.");
	        } else {
	            System.out.println(n + " is not a prime number.");
	        }
	}

}
