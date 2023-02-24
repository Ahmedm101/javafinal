package javaMemory;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//0's factorial is by default 1
		// 4 factorial is 4*3*2*1 = 24
		
		
		int num =0;
		 System.out.println("enter the number below");
		 
		 Scanner sc = new Scanner(System.in);
	num=	 sc.nextInt();
	System.out.println("checking the num : " +num);
	
	//process
	//non recursive
	
	int fact=1;
	if(num==0)System.out.println("factorial of 0 :" +1);
	
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
      System.out.println("factorial is" +fact);
	}

}
