
public abstract class MotorBike extends Bike {

	public void engine() {
		System.out.println("engine");
	}
	
	public void tires() {
		System.out.println("tires");
	}
	
	public abstract void mirror();
	
	public abstract void seat();
}
