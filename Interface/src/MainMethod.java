
public class MainMethod {

	public static void main(String[] args) {

		Addition ad = () -> {
			System.out.println("hello");
		};
		ad.hello();
		ad.display("Welcome");
		Addition.add(10, 10);
	}
}
