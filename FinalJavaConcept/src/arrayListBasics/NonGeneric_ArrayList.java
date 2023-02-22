package arrayListBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGeneric_ArrayList {

	public static void main(String[] args) {
		// non genric we can add mutiple datatypes
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add("shams");
		ar.add('c');
		ar.add(true);
		
	// print the length
		System.out.println(ar.size());
		
	// print  what is in index 3;
		System.out.println(ar.get(3));
		// this will print the value of index 3
		
		// for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//iterator
	//	Iterator it = new Iterator(); and print with while has not 
		// iterator doesn't have index 
		

	}

}
