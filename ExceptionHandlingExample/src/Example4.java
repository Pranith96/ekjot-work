
public class Example4 {

	public static void main(String[] args) throws DataNotFoundException2 {
		try {
			int age = 18;

			if (age < 20) {
				throw new DataNotFoundException2("Age is less than 20");
			}
		} catch (DataNotFoundException2 ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("hi");
	}
}
