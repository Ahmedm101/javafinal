package arrayList_Object2;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_PrintingValues {

	public static void main(String[] args) {
		
		// calling the static global variable
		MainCons.x =20;  // so static 
		System.out.println(MainCons.x);
		
		MainCons ob= new MainCons("shams", 20, "qa");
	System.out.println(ob.name);
	
	MainCons ob2= new MainCons("evan", 20, "qa");
	System.out.println(ob2.name);
	System.out.println("$$$");
	
	// object er datatype is class 
	ArrayList <MainCons> ar3 = new ArrayList<MainCons> ();
	ar3.add(ob);
	ar3.add(ob2);
	
	System.out.println(ar3.size());
	System.out.println(ar3.get(1)); //arrayList_Object2.MainCons@27f674d
	
	for(int i=0;i<ar3.size();i++) {
		System.out.println(ar3.get(i).name);
		System.out.println(ar3.get(i).age);
	}
	System.out.println("$$$");
	
	Iterator<MainCons> it = ar3.iterator();  // object ta bujhinaia ektu help please 
	while(it.hasNext()) {
		MainCons obb=it.next();
		System.out.println(obb.name);
		System.out.println(obb.age);
	}
	// iterator er jonno ki uporer ta korte hobe?
	
	}

}
