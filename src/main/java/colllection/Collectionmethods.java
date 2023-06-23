package colllection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collectionmethods {

	public static void main(String[] args) {


LinkedList list = new LinkedList(); 
list.add("name");
list.add("identity");
list.add("roll no");
list.add("class name");
list.add(null);
list.add(null);
list.add(10);

System.out.println("Linked list is " + list);

///Now create the collection for the elements 

Collection collect = new ArrayList();
collect.add("Surya");
collect.add("Vishnu college");
collect.add("252");


//append the collection to the linked list 
list.addAll(collect);
//print the new list 
System.out.println("new list is " +list) ;
// removing the last element 
list.removeLast();
System.out.println("new list is " +list) ;
///removing all elements in the previuos list
list.removeAll(list);
System.out.println("new list is " +list) ;
list.removeAll(collect);
System.out.println("new list is " +list) ;
list.isEmpty();
System.out.println("new list is " +list) ;
list.retainAll(collect);
System.out.println("new list is " +list) ;

//TreeSet set = new TreeSet();

Set set = new HashSet();
set.add("Surya");
set.add("Vishnu college");
set.add("252");
set.add(null);
set.add(null);

System.out.println("Elements in the Set are : " + set);
//cursors 

Iterator itr = set.iterator();

while(itr.hasNext()) {
	
	
	Object ele = itr.next();
	
	System.out.println("Elements in the TreeSet are :" + ele);
	

}



















	}

}
