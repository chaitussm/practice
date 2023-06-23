package oops;


public class OverLoading {

	
	public int Sum(int a, int b){
		
		System.out.println(" Add the integer number");
		
		return a+b;
	}
	
	public float  Sum(float i, float j){
		
		System.out.println("Add the float numbers");
		
		return i+j;
	}



	public static void main(String[] args) {

    OverLoading obj = new OverLoading();
    
    System.out.println(obj.Sum(1.3f, 1.2f));
    System.out.println(obj.Sum(1, 2));
	}
	
	
}