package javaMemory;

public class Factorial_recursiveway {

	
	public static int fact(int num) {
		
		if(num==0)return 1;
		else {
			return (num*fact(num-1));
		}
		
	}
	
	
	// when we are calling the method inside the method 
	
	public static void main(String[] args) {
		
		
		System.out.println(fact(4));
		
		
		
		
		
		
		
		

	}

}
