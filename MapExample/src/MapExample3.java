import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MapExample3 {

	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<>();

		Student student1 = new Student(1, "ABc");
		Student student2 = new Student(2, "PQR");
		Student student3 = new Student(3, "XYZ");
		Student student4 = new Student(4, "QWE");
		Student student5 = new Student(5, "HGF");

		map.put(1, student1);
		map.put(2, student2);
		map.put(3, student3);
		map.put(4, student4);
		map.put(5, student5);

		System.out.println(map);

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		System.out.println(list);
		Map<Integer, List<Student>> map1 = new HashMap<>();
		map1.put(1, list);
		System.out.println(map1);

		//Hashtable<Integer,String> ht = new Hashtable<>();
	}
}
