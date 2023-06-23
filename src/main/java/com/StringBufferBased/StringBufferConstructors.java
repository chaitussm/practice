package com.StringBufferBased;

public class StringBufferConstructors {

	public static void main(String[] args) 
	{
       StringBuffer sb1= new StringBuffer();
       
       
       
       sb1.append("ab");
       sb1.append("c");
       
       System.out.println("New capacity" + sb1.capacity());
       
       
       //Capacity of the string buffer for string 
       StringBuffer sb = new StringBuffer("durga");
		System.out.println(sb.capacity());
		
		//Append()
		StringBuffer bs = new StringBuffer();
		bs.append("PI value is :");
		bs.append("3.14");
		bs.append(":It is always");
		bs.append(true);
		System.out.println(bs);
		
		//insert()
		StringBuffer sba = new StringBuffer("software");
		sba.insert(0, "durga ");
		System.out.println(sba);
		
		//setlength()
		StringBuffer ba = new StringBuffer("GeeksForGeeks");
		ba.setLength(6);
		System.out.println(ba);
		
		//Ensurecapacity()
		StringBuffer b = new StringBuffer();
		b.ensureCapacity(20);
		//(16*2)+2
		System.out.println(b.capacity());
		
		//trimtoSize()
		StringBuffer b1 = new StringBuffer(1000);
		b1.append("software");
		b1.trimToSize();
		System.out.println(b1.capacity());



	}

}
