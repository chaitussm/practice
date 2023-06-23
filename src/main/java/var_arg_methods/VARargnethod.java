package var_arg_methods;

public class VARargnethod {
	 
	public static void m1(int... x) {
		
		
		System.out.println("VAR-ARG method");
		
		System.out.println("length of x- one dimensional array is " + x.length);
	}

	public static void main(String[] args) {
		
		m1();
		m1(10);
		m1(10,20,30);
		m1(10,20,30,40);

	}

}
