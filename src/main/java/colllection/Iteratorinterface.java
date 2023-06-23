package colllection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Iteratorinterface {

	public static void main(String[] args) {
 //Create an ArrayList 
ArrayList list = new ArrayList();
///Add elements to the ArrayList
list.add("A");
list.add("B");
list.add("C");
list.add("D");


//Using iteraor to display all the elements 
System.out.print("Origial content of list are:");
Iterator itr = list.iterator();

while(itr.hasNext()){
	//Returns the next element in the iteration.
Object element = itr.next();
System.out.print(element +" ");
}

System.out.println();

///Now modify the elements in the list by listIterator
//Returns a list iterator over the elements in this list (in proper sequence). 
ListIterator litr = list.listIterator();
while(litr.hasNext()){
	Object element = litr.next();
	litr.set(element + "+");
	
}
	System.out.print("Modified contents of list are :");
	
	//Here again we need to iterate each element by using while loop since the iteration is not fixed
	itr = list.iterator();
	
while(itr.hasNext()){
	Object element = itr.next();
	System.out.print(element + " ");
}
System.out.println();	
	///Now gain we need display backwards 	

System.out.print("Modified list backwards:");
///Returns true if this list iterator has more elements when traversing the list in the reverse direction. 
//(In other words, returns true if previous would return an element rather than throwing an exception.)
while(litr.hasPrevious()){
	Object element = litr.previous();
	///Returns the previous element in the list and moves the cursor position backwards. 
	////This method may be called repeatedly to iterate through the list backwards, or 
	////intermixed with calls to next to go back and forth. 
	////(Note that alternating calls to next and previous will return the same element repeatedly.)
	
	System.out.print(element+ " ");
	
	
}
	
System.out.println();	
	
	
Set<String> set = new HashSet<String>();

set.add("A");
set.add("B");
set.add("C");
set.add("D");
set.add(null);
set.add(null);

Iterator iTr = set.iterator();

while(iTr.hasNext()) {
	
	Object ele = iTr.next();
	
	System.out.println("Elements in the set are "+ ele + " ");
}
	
	



		
	}

}
