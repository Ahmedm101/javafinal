package hashTable;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashTable_Generic {

	public static void main(String[] args) {
		
		// so for generic if string need to key then value also string ??
		Hashtable<String, String> h = new Hashtable<>();
		h.put("12", "123");
		h.put("34", "234");
		h.put("1500", "1500");
		
		System.out.println(h);
		//{12=123, 34=234, 1500=1500}entry set 
		// map is always {}
		
	Set<String> keys=	h.keySet();
	System.out.println(keys);
	//[12, 34, 1500] // descending order    or ascending ?????
	// keys in set because no duplicate insertion is allowed

   Collection <String> allvalues =	h.values();
   System.out.println(allvalues);
   //[[123, 234, 1500]               // so here also decending order?
   
   System.out.println(h.entrySet());
   //[12=123, 34=234, 1500=1500] 
   // collection format can be set, list queue will be in []  
   
   System.out.println(h.size());
	}

}
