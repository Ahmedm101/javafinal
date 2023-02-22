package javaMemory;

public class StringMemory {

	public static void main(String[] args) {
		
		
		String s1= "hello world";  //literal
		
		String s2 ="hello world";
		
		String s3 =s1;
		
		String n1 = new String("hello world"); // object String
		String n2= new String ("hello world");
		
		System.out.println(s1==s2); //true
		System.out.println(s2==s3);  //true
		System.out.println(s3==s1);  //true
		
		System.out.println(n1==n2); // false
		System.out.println(n2=s1); //false
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
