
public class MotorBikeImpl implements Bike, Bike2{

	@Override
	public void engine() {
		System.out.println("engine1");
	}

	@Override
	public void mirror() {
		System.out.println("mirror1");
	}

	@Override
	public void seat() {
		System.out.println("seat1");
	}

	@Override
	public void tire() {
		System.out.println("tire1");
	}

	@Override
	public void breaks() {
		System.out.println("breaks1");
	}

}
