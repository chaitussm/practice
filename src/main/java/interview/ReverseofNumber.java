package interview;


import java.io.*;


public class ReverseofNumber {

	
			
			// Function to reverse the number
			static int reverse(int n){
				
			int rev = 0; // reversed number
			int rem; // remainder
				
			while(n>0){
				
				rem = n%10;
				rev = (rev*10) + rem;
				n = n/10;
			}
				
			return rev;
			}
			
		// Driver Function
			public static void main (String[] args) {
				int n = 6789;
				
				System.out.println("Reversed Number is "+ reverse(n));
				
				if(n == reverse(n)) {
					
					System.out.println(n + "is a palindrome");
				}else 
					
					System.out.println(n + "is not a palindrome");
					
				
			}
		}


	


