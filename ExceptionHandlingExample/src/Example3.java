
public class Example3 {

	public static void main(String[] args) {
		int age = 18;
		
		if(age < 20) {
			throw new DataNotFoundException("Age is less than 20");
		}
		
	}
}
