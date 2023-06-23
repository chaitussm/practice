package com.FileOperations.IO;

public class demographics 
{
	
	private String name;
	private String phone;
	private String email;
	private String currency;
	private double number;
	
	public demographics(String name, String phone , String email,  String currency, double number)
	{
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.currency = currency;
		this.number = number;
		
	}
	
	public String toString()
	{
		return "<"  + ","+ name + " ," + phone + ", " + email + " , " + currency + "," + number + ">" ;
		
	}

}
