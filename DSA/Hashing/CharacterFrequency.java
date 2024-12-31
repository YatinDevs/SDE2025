package Hashing;
import java.util.*;

public class CharacterFrequency {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// 
		
		Scanner  sc = new Scanner(System.in);
		 String s;
	     s = sc.next();
		
	     //precompute:
	      int[] hash = new int[26];
	      
	      for (int i = 0; i < s.length(); i++) {
	    	  hash[s.charAt(i) - 'a'] += 1;
	      }
	      
	      int q;
	      q = sc.nextInt();
	      
	      while(q-- > 0) {
	    	  char c;
	    	  c = sc.next().charAt(0);
	    	  System.out.println(hash[c - 'a']);
	      }
	}

}
