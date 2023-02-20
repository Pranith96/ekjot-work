import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample2 {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

		map.put(1,"ABC");
		map.put(2, "PQR");
		map.put(3, "ABC");
		map.put(3, "XYZ");
		System.out.println(map);
		
	
		for(Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + " "+ data.getValue());
			map.remove(2);
		}
		
		System.out.println(map);

	}
}
