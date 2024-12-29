package Recursion;
import java.util.*;

public class PrintNto1 {

		
		public static void printTillN(int count , int n) {
			
			if(count > n) return;
			System.out.println(count);
			
			printTillN(count + 1,n);
		}
		
		public static void printFromN(int count , int n) {
			
			if(count < 1) return;		
			System.out.println(count);
			printFromN(count - 1,n);
			

		}
	    

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       int n = 4;
//	       printTillN(1,n);
	       printFromN(n,n);
		}

	

}
