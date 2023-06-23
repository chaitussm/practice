package com.InterfaceExample;


interface Bank
{
	 
	int loanAmount = 1000;
	 int Tenure = 5;
	 
	   
	 
	 abstract void LoanProcedure();
	 
	 abstract void TypeOfLoan();

	 
}


class AxisBank implements Bank{
	 
	 

	public void LoanProcedure() 
	{
		
		 System.out.println("All loans with Mobile banking only ");
	}
	
	public void TypeOfLoan() {
		 
		 System.out.println("Home loans with 6.7% interest only  ");
	 }
	 
	 
}

public class DefinitionInterface {
	
	
	public static void main(String[] args) {
		
		Bank b = new AxisBank();
		
		b.LoanProcedure();
		int l = b.loanAmount;
		System.out.println(l);
		
	}

}
