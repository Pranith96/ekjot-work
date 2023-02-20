
public class Example1 {

	public static void main(String[] args) {
		//primitive to object
		int i = 10;
		Integer j = Integer.valueOf(i);
		//Autoboxing
		Integer k = i;
		
		// object to primitive
		Integer m = new Integer(10);
		int n = m.intValue();
		
		//unboxing
		int o = m;
	}
}
