import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		// Integer, String, Studentlist
		List<Integer> list = Arrays.asList(1, 11, 21, 2, 13, 12, 14, 3, 16, 4, 15, 5, 20, 6, 7, 17, 8, 9, 10);
		List<Integer> result = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(result);

		List<Integer> result1 = list.stream().map(y -> y * 5).collect(Collectors.toList());
		System.out.println(result1);

		list.stream().filter(x -> x % 2 == 0).map(y -> y * 5).forEach(z -> System.out.println(z));

		List<Integer> result2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(result2);

		List<Integer> result3 = list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println(result3);

		long value = list.stream().count();
		System.out.println(value);

		Optional<Integer> data = list.stream().max((x, y) -> x.compareTo(y));
		System.out.println(data.get());

		Optional<Integer> data1 = list.stream().min((x, y) -> x.compareTo(y));
		System.out.println(data1.get());

		List<Student> list1 = Arrays.asList(new Student(1, "ABC", "11"), new Student(2, "XYZ", "12"),
				new Student(4, "YHC", "13"), new Student(3, "PQR", "14"));

		List<Student> response = list1.stream().sorted(Comparator.comparing(Student::getStudentName))
				.collect(Collectors.toList());
		System.out.println(response);
	}
}
