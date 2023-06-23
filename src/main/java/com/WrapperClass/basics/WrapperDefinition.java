package com.WrapperClass.basics;

public class WrapperDefinition 
{
    public static void IntegerWrap()
    {
    	//Wrapper classes contains 2 constructors 
    	//1.corresponding primitive
    	Integer I = new Integer(10);
    	System.out.println(I);
    	//2.String as an argument
    	Integer I1 = new Integer("10");
    	System.out.println(I1);
    }
    
    public static void BoleanWrap()
    {
    	Boolean B = new Boolean("True");
    	System.out.println(B);
    	Boolean b = new Boolean("TRUE");
    	System.out.println(b);
    	Boolean b1 = new Boolean("buddy");
    	System.out.println(b1);
    	Boolean B1 = new Boolean("java");
    	System.out.println(B1);
    	
    }
	public static void main(String[] args) 
	{
		
		IntegerWrap();
		BoleanWrap();
	}

}
