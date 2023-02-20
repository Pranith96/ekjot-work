
public abstract class Bike {

	public void hi() {
		System.out.println("hi");
	}
	
	public abstract void engine();
	
	public abstract void tires();
	
	public abstract void mirror();
	
	public void petrolTank() {
		System.out.println("petrol tank");
	}
	
	public void breaks() {
		System.out.println("breaks");
	}
}
