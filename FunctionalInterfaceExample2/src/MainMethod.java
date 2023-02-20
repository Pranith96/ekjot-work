import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainMethod {

	public static void main(String[] args) {
		Predicate<Integer> pd = (x) -> {
			if (x % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean result = pd.test(9);
		System.out.println(result);

		Predicate<Integer> pd1 = x -> x % 2 == 0;

		boolean result1 = pd1.test(101);
		System.out.println(result1);

		Supplier<Integer> s = () -> {
			Random rn = new Random();
			Integer i = rn.nextInt();
			return i;
		};
		Integer result2 = s.get();
		System.out.println(result2);

		Consumer<String> cn = (y) -> {
			System.out.println(y);
		};
		cn.accept("Hello welcome");
	}
}
