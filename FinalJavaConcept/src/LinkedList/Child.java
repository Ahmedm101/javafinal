package LinkedList;

class Child extends Parent{

	public void car() {
		System.out.println("car.child");
	}
	
	public void cycle() {
		System.out.println("cycle.child");
		//Reporter.addsteplog( "cycle method executing in line" + getlog.linenum);
		//Reporter.addsteploginfail( "cycle method executing in line" + getlog.linenum);
	// we add step logs and ss in listeners class 
	}
	
public void sum(int x) {
		
		System.out.println(x+ "sum.child");
	}

}
