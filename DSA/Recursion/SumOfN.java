package Recursion;
import java.util.*;

public class SumOfN {
    public static int sum = 0;
	
    // Using Loop
    
    public static void sumOfN(int count, int N) {
		int sum = 0;
		for(int i = 0;i<=N ; i++) {
			
			sum += i;
		}
		System.out.println(sum);
	  	
	}
    
    // Formula Approach
   public static int sumOfN2(int count, int N) {
		 
		return N*(N+1)/2;			 
	  	
	}
   
   // Using Recursion Parameterized Way
   
   public static void SumParamterizedTillN(int N, int sum) {
	   
	   if(N < 1) {
		   System.out.println("Sum : " + sum);
		   return;
	   }
	   
	   SumParamterizedTillN(N-1,sum+N);
	   
   }
   
   // functiona way 
   
   public static int sumOfNum(int N) {
	   
	   if(N == 0) {
		   return 0;
	   }
	   return N + sumOfNum(N-1);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int N = 5;
         sumOfN(1,N);
        System.out.println(sumOfN2(1,N));
        SumParamterizedTillN(N,0);
        System.out.println(sumOfNum(N));
 
	}

}
