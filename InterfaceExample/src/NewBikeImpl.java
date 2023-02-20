
public class NewBikeImpl implements Bike {
	@Override
	public void engine() {
		System.out.println("engine2");
	}

	@Override
	public void mirror() {
		System.out.println("mirror2");
	}

	@Override
	public void seat() {
		System.out.println("seat2");
	}

	@Override
	public void tire() {
		System.out.println("tire2");
	}

	@Override
	public void breaks() {
		System.out.println("breaks2");
	}

}
