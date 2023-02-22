package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_nongenric {

	public static void main(String[] args) {
		
		// non genric
		HashMap h = new HashMap();
		h.put(2, "hello");
		h.put(1, 123);
		h.put(500, "jingle");
		h.put("kite", "mite");
		h.put(2, "hi");
		
		System.out.println(h);
		//{1=123, 2=hi, 500=jingle, kite=mite}   is hashmap ascending order 
		
	Collection values =	h.values();
	System.out.println(values);
	//[123, hi, jingle, mite]
	
    Set keys=	h.keySet();
    System.out.println(keys);
  //  [1, 2, 500, kite]

	System.out.println(h.entrySet());
	
//	[1=123, 2=hi, 500=jingle, kite=mite]
		
		
		
		
		
	}

}
