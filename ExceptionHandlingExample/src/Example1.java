
public class Example1 {

	public static void main(String[] args) {
		try {
		int a = 10;
		int b = a/0;
		
		System.out.println(a);
		System.out.println(b);
		} catch(ArithmeticException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("in finally");
		}
		System.out.println("Hello welcome");
		System.out.println("java");
	}
}
