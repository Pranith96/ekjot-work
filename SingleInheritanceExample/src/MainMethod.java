
public class MainMethod {

	public static void main(String[] args) {
		Summation summation = new Summation();
		summation.add(5, 5);
		summation.hi();
		String result = summation.welcome("Ekjot");
		System.out.println(result);
	}
}
