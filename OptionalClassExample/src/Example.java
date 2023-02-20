import java.util.Optional;

public class Example {

	public static void main(String[] args) {
		String[] s = new String[5];
		//String str = s[3].toUpperCase();
		//System.out.println(str);
		s[3] = "hello";
		Optional<String> checkNull = Optional.ofNullable(s[3]);
		if(checkNull.isPresent()) {
			String ss = s[3].toUpperCase();
			System.out.println(ss);
		} else {
			System.out.println("String is empty");
		}
		
		System.out.println(checkNull.get());
		checkNull.ifPresent(x -> System.out.println(x));
	}
}
