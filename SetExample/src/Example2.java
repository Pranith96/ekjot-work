import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(2);
		set.add(13);
		set.add(1);
		set.add(2);
		set.add(14);
		set.add(5);
		set.add(6);
		set.add(11);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(12);
		set.add(4);
		set.add(5);
		set.add(6);
		
		System.out.println(set);
		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(10);
		set1.add(2);
		set1.add(13);
		set1.add(1);
		set1.add(2);
		set1.add(14);
		set1.add(5);
		set1.add(6);
		set1.add(11);
		set1.add(2);
		set1.add(3);
		set1.add(1);
		set1.add(12);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		System.out.println(set1);
	
	}

}
