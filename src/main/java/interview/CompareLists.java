package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareLists{
	
	public static void main(String[] args) {
		
		
		List<String> l1 = new ArrayList<String>();
		l1.add("India");
		l1.add("USA");
		l1.add("Germany");
		l1.add("France");
		
		List<String> l2 = new ArrayList<String>();
		
		l2.add("India");
		l2.add("USA");
		l2.add("Germany");
		l2.add("France");
		
		Collections.sort(l2);
		
		for(int i = 0; i<l1.size(); i++)
		{
			
			for(int j = 0; j< l2.size(); j++)
			{
				
				if(l1.equals(l2)) {
					
					System.out.println("Both lists are same ");
				}
				else {
					System.out.println("Both lists are not same");
				}
			}
			
			
		}
		
	}
	
}
	

