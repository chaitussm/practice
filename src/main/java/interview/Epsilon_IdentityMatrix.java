package interview;

import java.util.Scanner;

public class Epsilon_IdentityMatrix {

	public static void main(String[] args) {


		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		int n = scn.nextInt();
		int i,j;
		String m="";
		
		for(i=1;i<=n;i++){
			
			for(j=1;j<=n;j++){
				
				if(i==j){
					m = m + "1";
				}
				else{
					
					m = m + "0";
				}
				
			}
			
			m = m+ "\n";
		}
	
		System.out.println(m);
		
		
	}

}
