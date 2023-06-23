package com.arraybasedprograms;

public class ThirdLargest {

	
	public int thirdLargest(int a[]) {
		
		int temp;
		
		int total = a.length;
		
		for(int i=0 ; i < total; i++) {
			
			  for(int j =i +1; j < total; j++) {
				  
				  if(a[i] > a[j]) {
					  
					  temp = a[i];
					  a[i] = a[j];
					  a[j] = temp;
					  
				  }
			  }
		}
		
		return a[total-3];
		
	}
	public static void main(String[] args) {
		
		ThirdLargest tl = new ThirdLargest();

        int a[] = {4,7,8,0,9,13};
        
        System.out.println("Third Largest Number is " + tl.thirdLargest(a));
        
        
	}

}
