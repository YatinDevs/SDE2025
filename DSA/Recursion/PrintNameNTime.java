package Recursion;
import java.util.*;

public class PrintNameNTime {
     
	public static void printName(int n,int cnt) {
		
		if(cnt > n) return;
		System.out.println("Yatin");
		printName(n,cnt+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        printName(n,1);
	}

}
