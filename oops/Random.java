package oops;

public class Random {

	public static void main(String[] args) {


		char[] arr = { 'a', 'b','b','c', 'd'};
		
		char[] arr1 = new char[arr.length];
		
		int[] arr2 = new int[arr.length];
		
		
		int a = 0;
		int b = 0;
		
		boolean is_exists = false;
		
		for(int i =0; i< arr.length; i++) {
			
			
			for(int len = 0; len< arr1.length; len++) {
				
				
				if(arr[i] == arr1[len]) {
					
					
					is_exists = true;
				}
				else {
					
					is_exists = false;
					
					
				}
				
					
					
				
			}
			
		}
		
	}
	
	
}
				
				
			
		
		
		

	


