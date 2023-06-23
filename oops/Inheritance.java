package oops;

class Alpha{
	
	
	String maths;
	public String  maths(){
		
		System.out.println("Maths subject only");
		
		return maths;
		
}
}
	

class Beta extends Alpha{
	
	String science ;
	
	public String science(){
		
		System.out.println("Science marks only");
		return science;
	}
	
	
}

class Inheritance {

	public static void main(String[] args) {

		
		Beta b = new Beta();
		
		b.maths();
		b.science();
	}

}



