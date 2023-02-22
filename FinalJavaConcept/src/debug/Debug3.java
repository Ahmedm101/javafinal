package debug;

public class Debug3 {

	public static void main(String[] args) {
		
		
		Car ob = new Car("Owner is Shams");
		ob.setModel(2010);
	int year=	ob.getModel();
		System.out.println(year);
		
		
		Car ob1= new Car("Owner is Rinika");
		ob1.setModel(2000);
		ob1.setName("Maliha");
		
		
		//basically when we are making an array using object datatype all the objects will come
		Car ob3[]=new Car[2];
		ob3[0]=ob;
		ob3[1]=ob1;
		
		System.out.println(ob3[0].model);
		System.out.println(ob3[0].getName());
	
		
		
		
		
		
		

	}

}
