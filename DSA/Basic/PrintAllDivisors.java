package Basic;
import java.util.*;


public class PrintAllDivisors {
   
	public static int[] printDivisors(int n,int[]size ) {
		
		int[] divisors = new int[n];
		
		int count = 0;
		
		for(int i = 1;i<=n;i++) {
			
			if(n % i == 0) {
				divisors[count++] = i;
			}
		}
		
		size[0] = count;
		return divisors;
	}
	
	
	public static void printAllDivisors(int n) {
		
		for(int i = 1 ; i * i <= n ;i++) {
			
			if(n % i == 0) {
				System.out.print(i + " ");
				
				if(n/i != i) {
					System.out.print(n/i + " ");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem Statement: Given an integer N, return all divisors of N.
		
		int num = 36;
		int []size  = new int[1];
        int[] divisors = printDivisors(num, size);
        
        System.out.print("Divisors of " + num + " are: ");
        for (int i = 0; i < size[0]; i++) {
            System.out.print(divisors[i] + " ");
        }
        System.out.println();
        
        System.out.println("Divisors are below: ");
        printAllDivisors(num);
	}

}
