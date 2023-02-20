
public class MainMethod {

	public static void main(String[] args) {
		Bike bike = new MotorBikeImpl();
		bike.breaks();
		bike.engine();
		bike.mirror();
		bike.seat();
		bike.tire();

		NewBikeImpl bike1 = new NewBikeImpl();
		bike1.breaks();
		bike1.engine();
		bike1.mirror();
		bike1.seat();
		bike1.tire();

	}

}
