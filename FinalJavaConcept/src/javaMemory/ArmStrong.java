package javaMemory;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		//find out 153 is an armstrong number -- 
		//numbers cannot be less than 0
		
		int num =0;
		System.out.println("enter the number below and press enter");
		
		Scanner sc = new Scanner(System.in);
	num =	sc.nextInt();
	System.out.println(num );
	
	System.out.println("we are checking the" +num );
	
	//process:
	
	int sum =0;
	int r;
	int t;
	
	t=num; //t=153
	
	while(num>0) {
		r=num%10;
		sum =sum+(r*r*r);
		num=num/10;
	}
	if(t==sum) {
		System.out.println("it is an armstrong number");
	}
	else {
		System.out.println("it is not an armstrong number");
		
	}
	

	}

}
