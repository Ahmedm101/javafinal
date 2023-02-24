package javaMemory;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	int num =0;
	
	System.out.println("enter a number below and press enter");
	Scanner sc = new Scanner(System.in);
  num =	sc.nextInt();
  System.out.println("we are checking the num: "+num);
  
  int sum =0;
  int r;
  int t;
  
  t =num;
  
  while(num>0) {
	  r =num%10;
	  sum =(sum*10)+r;
	  num =num/10;
  }
  if(t==sum) {
	  System.out.println("it is a palindrome number");
  }
  else {
	  System.out.println("it is not a palindrome number");
  }
		  
	  
  
  

	}

}
