package interview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int x, fact =1;
		
		Scanner sc = new Scanner(System.in);
		
		 x = sc.nextInt();
		
		if(x<0)
			
         System.out.println("x shouldn't be a non-negative number");

		else {
			
			
			for (int i =1; i <=x ; i++)
				
				
				fact = fact*i;
			
			System.out.println("Factorial of " + x + " is " + fact );
		}

	}

}
