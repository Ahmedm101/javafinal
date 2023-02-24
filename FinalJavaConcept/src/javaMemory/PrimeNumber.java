package javaMemory;

import java.util.Scanner;

public class PrimeNumber {
      
	// it needs to be bigger than 1
	// remainder need to be 0 and count only 2 as in divide 1 and itself 
	
	public static void main(String[] args) {
		
		
	int num =0;
	 System.out.println("enter the number below and press enter ");
	 
	 Scanner sc = new Scanner(System.in);
	num= sc.nextInt();
	System.out.println("we are checking the num : " +num);
		
		//process start
	
	int count =0;
	 if(num>1) {
		 for(int i=1;i<=num;i++) {
			 if(num%i==0)count++;
		 
		 }
		 if (count==2) {
			 System.out.println("it is a prime number");
		 }
		 else {
			 System.out.println("it is not a prime number");
		 }
	 }
	 else {
		 System.out.println("it is a normal number");
		 
	 }
		

	}

}
