package LinkedList;


import java.util.Iterator;
import java.util.LinkedList;

public class Link_list {

	public static void main(String[] args) {
		
		
	LinkedList<String> ll = new LinkedList<>();
	ll.add("hello");
	ll.add("cow");
	ll.add("bmw");
	
  	ll.addFirst("Faruk"); // will add at very first 
  	System.out.println("a " + ll);
	
  	ll.addLast("Ummey");   // will add at very last 
	System.out.println("b " +ll);
	
	System.out.println(ll.get(0));
	
	ll.set(0, "maliha");
	System.out.println("all "+ll);
	
	System.out.println(ll.remove(3));
	
	ll.removeLast();
	System.out.println("last "+ll); // will remove the one we added 
	
	ll.removeFirst();
	System.out.println("first "+ll); // will remove the we added 
	
		//problem with b and remove
		
	Iterator <String> it=ll.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
		// for loop is also possible here 
	}
	

	}

}
