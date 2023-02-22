package javaMemory;

public class String_interview {

	public static void main(String[] args) {
		
		
		// lenght of string 
		
		String s1 ="hello";
	int length =	s1.length();  // returns int
	System.out.println(length);
	
    String s2="";
  boolean t =  s2.isEmpty();  // returns boolean we can do syso or save in boolean ??
  System.out.println(t);      // answer is true 
  
System.out.println(s1.isEmpty()); // false as s1 is hello

         // trim
      String s3 ="        hello";
    String trim =  s3.trim();
    System.out.println(trim);     // hello will be the answer, it will trim all the spaces
    
    
   int l = s3.length();
   System.out.println(l); //13
   
   String s4 ="  hi am   ";
  String trimmedValue = s4.trim();
  System.out.println(trimmedValue);  // trim always trim spaces from front and back
  
  int noOfTrim =  trimmedValue.length();
  System.out.println(noOfTrim);   // 5 , it will find how many spaces was removed
  
  // how to use Trim and lenght together
  
  String s5 ="   mal iha      ";
 int tl = s5.trim().length();
 System.out.println(tl); // it is removing the space from front and back and giving the lenght
                          // here the lenght will always include alphabet and the space in the middle
 
 // comparing 2 strings 
 String s6 ="Phython";
 String s7 = "Phython";
 
 System.out.println(s6.equals(s7));  // true
 
 String s66 ="Phython";
 String s77 = "phython";     
 
 System.out.println(s66.equals(s77)); //false    // case sensitive 
 
 String s666 ="Phython";
 String s777 = "phython";
 System.out.println(s666.equalsIgnoreCase(s777)); //true   // removes case sensitivity
 
 // compare to   lexographical ???
                                 //every character has unicode value 
 String s8 ="maliha";
 String s9 ="Faruk";
 System.out.println(s8.compareTo(s9));
 
 //concat
 String s10 ="hello";
 String s11 ="world";
 
 String add =s10.concat(s11);
 System.out.println(add); //helloworld
 
     String add2 = s10.concat("world");
     System.out.println(add2); //helloworld
     
     // join
     
     String s12 ="benz";
     String s13 ="Audi";
  System.out.println( String.join(",",s12,s13)); //benz,Audi
  
 String join = String.join(",", s12,s13);
 System.out.println( join);    //benz,Audi
 
 //substring ??
  String s15 = "ToyotaHondaNissan";
  
  // replace
   String s16 = " I am learning Java am";

   System.out.println(s16.replace("am", "hi")); //I hi learning Java hi
 
  
 String s17 = "I am learning Java but I am good";
  String replace2 =s17.replaceFirst("am","not" );
 System.out.println(replace2);   //I am not learning Java
 
 String all =s17.replaceAll("learning(.*)", "hello");
 System.out.println(all);   // it will replace everything after learning and will add hello
                    //I am hello
 
 System.out.println(s17.replace(" ", "_")); //I_am_learning_Java_but_I_am_good
 
 //index of   ??
 String s18 ="selenium";
System.out.println(s18.indexOf(6));  //-1

 
 // contains
System.out.println(s18.contains("e"));  //true

// ends with and starts with 
System.out.println(s18.endsWith("mmm")); //false
System.out.println(s18.startsWith("s")); //true



 
   
 
   
   
   
    

		
		
		
		
		
		

	}

}
