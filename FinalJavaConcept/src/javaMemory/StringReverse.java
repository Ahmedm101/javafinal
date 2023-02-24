package javaMemory;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		
		String s= "Evan";
		
	int l=	s.length();
	
	String rev="";
	
	for(int a=l-1;a>=0;a--) {
		rev=rev+s.charAt(a);
	}
		
		System.out.println(rev);
		
		M();

	}
	
	public static void M() {
		
		String s="";
		 System.out.println("enter the string value below");
		 
		 Scanner sc = new Scanner(System.in);
		s= sc.next();
		
		System.out.println("the s: "+s);
		 
		
		
	int L=	s.length();
	
	String rev ="";
	for(int i=L-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
	
		
		
		
		
		
		
		
	}

}
