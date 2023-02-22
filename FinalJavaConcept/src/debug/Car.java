package debug;

public class Car {

	int model;
	String owner;
	String name;
	
	public void setName(String newName) {
		this.name=newName;
		
	}
	
	//no input but having return type 
	public String getName() {
		return name;
	}
	
	public void setModel(int year) {
		this.model =year;
	}
	
	public int getModel() {
		return model;
	}
	
	public Car(String newOwner) {
		owner = newOwner;
	}
	
}
