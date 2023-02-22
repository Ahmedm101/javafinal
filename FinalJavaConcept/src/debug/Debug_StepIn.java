package debug;

public class Debug_StepIn {

	public static void main(String[] args) {
		int x =7;
		int y=7;
		
	int addMethod =	 add(x,y);
		 
		 System.out.println(addMethod);
		
		

	}
	private static int add(int x,int y) {
		int sum =x+y;
		return sum;
	}

}
