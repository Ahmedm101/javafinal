package javaMemory;

public class Basics_Of_Memory {

	int x;
	int y;
	static int car;
	
	
	public void m1() {
		int a =20; // local variable
		m3(); // for calling ns methods we dont need to make an object of the class
	}
	
	public void m2() {
		
		int yellow = 400; 
		m1();
	}
	
	public void m3() {
		String car = "bmw";
		m2();
	}
	
	
	public static void main(String[] args) {
		
		Basics_Of_Memory ob = new Basics_Of_Memory();
		ob.m2();
		ob.x =300;
		
		
		// couldn't debug help please
	}

}
