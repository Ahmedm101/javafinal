package javaMemory;

public class Sawpping {

	public static void main(String[] args) {
		
		//using 3rd variable
		int a=10; 
		int b=20;
		
		System.out.println("before swapping: "+a +" "+b);
		
		int c=a; //10
		    a=b;  //20
		    b=c; //20
		  
		    System.out.println("after swapping: "+a +" "+b);
		    
		//without third variable
		    
		    a=a+b;  //30
		    b =a-b;  //10
		    a =a-b; //20
		    
		    System.out.println("after swapping: "+a +" "+b);
		    
		 // using (* and /) condition a and b cannot be zero
		    a=a*b; //200
		    b=a/b;  //10
		    a=a/b;   //20
		    
		    System.out.println("after swapping: "+a +" "+b); 		
		
		

	}

}
