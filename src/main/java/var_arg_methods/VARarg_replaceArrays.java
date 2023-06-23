package var_arg_methods;

public class VARarg_replaceArrays {
	
	public static void m1(int[]... x) {

		for(int[] x1 : x) {
			
			System.out.println(x1[0]);
			
		}
		
		
	}

	public static void main(String[] args) {
		
		
	     int[] a = {10,20,30};
	     
	     int[] b = {40, 50, 60};
	     
	     m1(a,b);
	}

}
