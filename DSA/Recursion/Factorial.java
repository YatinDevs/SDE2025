package Recursion;
import java.util.*;

public class Factorial {
    // Iterative Approach

	public static void factorial(int x) {
		int fac = 1;
		for(int  i = 1;i<= x ; i++) {
			fac = fac * i;
		}
		
		System.out.println(fac);
	}
	
	// Recursive Approach
	
	
	public static int fact(int x) {
		if(x == 0) {
			return  1;
		}
		
		return x * fact(x-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial(5);
		System.out.println(fact(5));

	}

}
