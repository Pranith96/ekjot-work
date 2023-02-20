import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		//Map<Integer,String> map = new LinkedHashMap<>();
//		Map<Integer,String> map = new TreeMap<>();
		Map<Integer,String> map = new HashMap<>();

		map.put(1,"ABC");
		map.put(2, "PQR");
		map.put(3, "ABC");
		map.put(4, null);
		map.put(null, "YUY");
		map.put(3, "XYZ");
		map.put(null, "YPK");
		System.out.println(map);
		
		
		System.out.println(map.get(2));
		System.out.println(map.get(4));

		System.out.println(map.isEmpty());
		
		map.remove(3);
		System.out.println(map);
		System.out.println(map.keySet());
		
		System.out.println(map.size());
		
		for(Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + " "+ data.getValue());
			//map.remove(1);
		}
	}
}
