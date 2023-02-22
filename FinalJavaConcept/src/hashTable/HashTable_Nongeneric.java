package hashTable;

import java.util.Hashtable;

public class HashTable_Nongeneric {

	public static void main(String[] args) {
		
		//non genric 
	Hashtable h =new Hashtable(); // why is different here as in the key and value like char is 10 why?
	h.put("A","name");
	h.put("c", 10);
	h.put('e', "test");
	h.put("c", "try");
	h.put(2,"200");
	
	System.out.println(h.size());
	
	System.out.println(h.get("A"));
	System.out.println(h.get("c"));
	System.out.println(h); //{A=name, 2=200, e=test, c=try}
		
		// DUPLICATE key is not possible but value is possible
	// we print by giving Key in get method
	// duplicate key will replace the old value
	// Map is keywise not index wise 
	
	// hashatable legacy jdk mapping concept er part , it imp for dev 
	
	

		

	}

}
