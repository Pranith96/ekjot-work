import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSort {

	public static void main(String[] args) {

		List<BigInteger> list = new ArrayList<>();
		list.add(new BigInteger(String.valueOf(24)));
		list.add(new BigInteger(String.valueOf(543534)));
		list.add(new BigInteger(String.valueOf(545)));
		list.add(new BigInteger(String.valueOf(2342)));
		list.add(new BigInteger(String.valueOf(9)));

		List<BigInteger> result = arrayListSortDesc(list);
		System.out.println(result);
	}

	private static List<BigInteger> arrayListSortDesc(List<BigInteger> list) {
		List<BigInteger> result = list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		return result;
	}
}
