package Basic;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int reverseNum = 0;
       
       int N  = 7789;
       
       while(N > 0) {
    	   
    	  int lastdigit =  N % 10; 
    	  reverseNum = (reverseNum * 10) + lastdigit;
    	  
    	  N = N/10;  // decrement 
    	 
       }
       
       System.out.println(reverseNum);
	}

}