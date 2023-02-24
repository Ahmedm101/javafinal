package javaMemory;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		
		// story point is fibonacci series        //2 //5 //9 //14
		// the sequence of the number adding up ex:1+2+3+4+5
		
		int n1=0;
		int n2=1;
		int sum;
		
		System.out.println(n1+"  "+n2);
		
		for(int i=2;i<10;i++) {
			sum =n1+n2;
			System.out.println(" " + sum);
			
			n1=n2;
			n2=sum;
		}
		
		
		
		
		
		
		

	}

}
