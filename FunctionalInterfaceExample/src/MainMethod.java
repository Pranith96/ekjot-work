
public class MainMethod {

	public static void main(String[] args) {
		Addition ad = new AdditionImpl();
		ad.hello();
		
		Addition ad1 = () -> {
			System.out.println("hi");
		};
		ad1.hello();
		
		Addition ad2 = () -> System.out.println("hi");
		ad2.hello();
		
		Summation sm = (x, y) -> {
			int c = x+y;
			System.out.println(c);
		};
		sm.add(10, 10);
		
		Calculation cl = (a,b) -> {
			int c = a+b;
			return c;
		};
		int result = cl.sum(10, 10);
		System.out.println(result);
	}
}
