package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_Generic {

	public static void main(String[] args) {
		
		
		//genric
		
		HashMap<String, String> h = new HashMap<>();
		h.put("hello", "maliha");
		h.put("maliha", "girl");
		h.put("Aamir", "boy");
		
		System.out.println(h);
		//{maliha=girl, Aamir=boy, hello=maliha} ??
		
	Collection<String> allvalues =	h.values();
	System.out.println(allvalues);
	//[girl, boy, maliha]   ????
	
  Set<String>	allkeys = h.keySet();
  System.out.println(allkeys);
  //[maliha, Aamir, hello]  ???
  
  
  
  System.out.println(h.entrySet());
 // [maliha=girl, Aamir=boy, hello=maliha] ???
  
 // HashMap<int, int> hh = new HashMap<>(); why integar not alowed
  
  
		
		
		
		
		
		
		
		

	}

}
