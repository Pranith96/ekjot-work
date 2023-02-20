
public class MainMethod {

	public static void main(String[] args) {
		
		Place place = new Place();
		place.setPlaceId(1);
		place.setPlaceName("US");
		
		Address address1 = new Address();
		address1.setAddressId(1);
		address1.setCity("TC");
		address1.setState("TTY");
		address1.setPlotNo("10");
		address1.setCountry("ABC");
		address1.setPlace(place);
		
		Student student1 = new Student();
		student1.setStudentId(1);
		student1.setStudentName("Ekjot");
		student1.setMobileNumber("1234567890");
		student1.setRollNumber("123456");
		student1.setAddress(address1);
		
		String name = student1.getStudentName();
		System.out.println(name);
		System.out.println(student1.getMobileNumber());
		System.out.println(student1);
		
		Student student2 = new Student();
		student2.setStudentId(2);
		student2.setStudentName("ABC");
		student2.setMobileNumber("1234567880");
		student2.setRollNumber("12345");
		student2.setAddress(address1);
		student2.getAddress().setPlace(place);
		System.out.println(student2);
		System.out.println(student2.getAddress().getCountry());
		System.out.println(student2.getAddress().getPlace().getPlaceName());
		
		Place pl = new Place(1,"XYZ");
		Address ad = new Address(2,"12","fgh","fghj","tyui",pl);
		Student st = new Student(3,"qwerty","1234","1234567890",ad);
		System.out.println(st);
		Address ad1 = new Address(2,"12","fgh","fghj","tyui",new Place(1,"PQR"));
		Student st1 = new Student(3,"qwerty","1234","1234567890",new Address(2,"12","fgh","fghj","tyui",new Place(1,"PQR")));
		System.out.println(st1);

	}
}
