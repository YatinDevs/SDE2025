package Recursion;
import java.util.*;

public class PrintNTimes {
     
	public static void recursiveFunction() {
		System.out.println("Started Execution");
		recursiveFunction();
		System.out.println("Completed Execution");
		
	}
	
//	Recursive code for printing numbers from 0 to 3 : 
	public static int count = 0;

	public static void printNumbers() {
		
		// Base COndition
		if(count > 3) return;
		System.out.println(count + " ");
		
		// COunt increment
		count++;
		printNumbers();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     //      recursiveFunction();
     // It will keep printing line 7 and run out of memory after some time
     // Exception in thread "main" java.lang.StackOverflowError
		
		
		
//		Recursive code for printing numbers from 0 to 3 : 
		printNumbers();
	}

}
