package com.CollectionBased.examples;

import java.util.LinkedList;
import java.util.List;

public class AddTwoLists {
	
	
	public static List<String> AddLists() {
		
		List<String> namelist = new LinkedList<String>();
		
		namelist.add("Whitefiled");
		namelist.add("Kalyan Nagar ");
		namelist.add("Whitefiled");
		namelist.add("Indiranagar");
		namelist.add("Bommanahalli");
		
		List<String> Arealist = new LinkedList<String>();
		
		namelist.add("Kadugudi");
		namelist.add("Adugudi");
		namelist.add("Kammanalli");
		
		for(String ar : namelist) {
			
			if(ar.contains("whitefield")) {
				
				Arealist.addAll(namelist);
			}
		}
		
		return Arealist;
	}

	public static void main(String[] args) {
		
	
	
		System.out.println("New list is " + AddLists());
	
		

	}

}
