
public class MainMethod {

	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.add(5, 5);
		ad.printNumbers(5);
		System.out.println();
		System.out.println(".................");
		Subtraction subtraction = new Subtraction();
		subtraction.sub(10, 5);
		subtraction.printNumbers(10);
	}
}
