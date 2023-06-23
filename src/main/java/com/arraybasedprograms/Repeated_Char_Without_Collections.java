package com.arraybasedprograms;

public class Repeated_Char_Without_Collections {

	public static void main(String[] args) {
		
			    
		    char[] givenArray = {'a', 'a', 'b', 'c', 'c','d', 'a'}; 
		    
		    char[] tempArray = new char[givenArray.length];
		    
		    int[] posArray = new int[givenArray.length];
		    
		    
		    int t=0;
		    int p=0;
		    boolean is_exists=false;
		    
		    
		    for (int i=0; i<givenArray.length; i++) {  
		        
		        for (int len=0;len<tempArray.length; len++)
		        {
		            if ( givenArray[i] == tempArray[len] ){
		                is_exists=true; 
		                break;
		            }
		            else
		                is_exists=false;
		        }
		        
		        if ( is_exists == false ) {
		            tempArray[t]=givenArray[i];
		            t++;
		        }
		        else 
		        {
		            posArray[p]=i;
		            p++;
		        }
		        
		    }
		    
		     for (int i = 0; i < posArray.length; i++) 
		     
		      if (posArray[i] > 0 )
		      System.out.println( "Repeated Character --> "+givenArray[posArray[i]] + " At Position " + posArray[i] );
		     
		    
			
		
	}

}
