import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		try {
			int a[] = new int[3];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 4;

			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("hi");
		int b[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(b));
	}

}
