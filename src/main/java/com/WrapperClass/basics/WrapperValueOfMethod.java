package com.WrapperClass.basics;

public class WrapperValueOfMethod 
{
	//Form -1
	//public static wrapper valueof(string s)
	
	public static void ValueOfInt()
	{
		Integer I = Integer.valueOf("10");
		System.out.println(I);
	}
	
	public static void ValueOfDou()
	{
		Double d = Double.valueOf("10.5");
		System.out.println(d);
	}
	
	public static void ValueOfBool()
	{
		Boolean b = Boolean.valueOf("durga");
		System.out.println(b);
	}
	/*----------Form-2-------------------*/
	//public static wrapper valueof(String s, int radix)
	//Radix is allowed form 2 to 36 
	
	public static void ValueofRadix()
	{
		Integer I1 = Integer.valueOf("100" , 2);
		System.out.println(I1);
		Integer I2 = Integer.valueOf("100" , 4);
		System.out.println(I2);
	}
	
	/*----------Form-3-------------------*/
	//public static wrpper valueof(primitive p)
	public static void ValueofPri()
	{
		Integer i = Integer.valueOf(10);
		System.out.println(i);
		Character c = new Character('a');
		System.out.println(c);
		Boolean b = Boolean.valueOf("a");
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		System.out.println("********Form-1**********");
		ValueOfInt();
		ValueOfDou();
		ValueOfBool();
		System.out.println("********Form-2**********");
		ValueofRadix();
		System.out.println("********Form-3**********");
		ValueofPri();
 
		
	}

}
