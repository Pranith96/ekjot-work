import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		//List<Integer> list = new LinkedList<>(); // string , Student
		//Vector<Integer> l = new Vector<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(3));
		System.out.println(list.get(0)); // data
		System.out.println(list.indexOf(4)); // index
		list.remove(0);
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		for(Integer i : list) {
			System.out.println(i);
		}
	}
}
