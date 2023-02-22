package arrayListBasics;

import java.util.ArrayList;

public class Generic_ArrayList {

	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		ar2.add(10);
		ar2.add(8);
		ar2.add(0);
		
		// print the lenght
	System.out.println(ar2.size());
	
	//print the index 2 -- so here index 2 means the last one
	 System.out.println(ar2.get(2));
	 
	 //print all the value
	 for(int i =0; i<ar2.size();i++) {
		 System.out.println(ar2.get(i));
		 
	
	 }
System.out.println(ar2); //[10, 8, 0]

	}

}
