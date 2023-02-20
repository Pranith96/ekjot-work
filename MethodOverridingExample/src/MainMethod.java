
public class MainMethod {

	public static void main(String[] args) {
		ColorOvrde cl = new ColorOvrde(); // compiletime
		cl.blackColor("1", "2", "3");
		cl.redColor("4", "5");
		cl.whiteColor("6");
		Colors.hi();

		System.out.println("................");
		Colors cl1 = new ColorOvrde();  // runtime
		cl1.blackColor("1", "2", "3");
		cl1.redColor("4", "5");
		cl1.whiteColor("6");
	}
}
