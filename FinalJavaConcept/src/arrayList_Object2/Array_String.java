package arrayList_Object2;

import java.util.ArrayList;

public class Array_String {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("hello");
		arr.add("kitty");
		arr.add("meow");
		
		//print the size
		System.out.println(arr.size());
		
		//print the index 2
		System.out.println(arr.get(2));
		
		// print all the value of arr
		
		for(int q= 0;q<arr.size();q++) {
			System.out.println(arr.get(q));
			
		}
		
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("hello");
		arr2.add("jingle");
		arr2.add("bell");
		
		arr.removeAll(arr2); // will remove all the common ones from both arraylist
		arr.remove(0); // will remove 0 index
		arr.retainAll(arr2); // will retrive common ones from the both array list
		arr.clear();// will remove all the indexes

	}

}
