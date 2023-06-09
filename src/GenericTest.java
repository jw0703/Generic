//6월 7일 - 4
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
	
		for(String e:list) {
			System.out.println(e);
		}
		
		
		list.forEach(System.out::println);
		
		System.out.println("======================================");
		
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(4, "a");
		map.put(5, "b");
		map.put(6, "c");
		
		for(Integer key:map.keySet()) {
			System.out.println(key);
		}
	
		Iterator<Integer> it  = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key);
		}
	
		System.out.println("======================================");

		
		Iterator<String> it2  = map.values().iterator();
	
		while(it2.hasNext()) {
			String value = it2.next();
			System.out.println(value);

		}
		
		
		
		System.out.println("======================================");
		
		
		
		for(Map.Entry<Integer,String>entry :map.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		
		
		Iterator<Map.Entry<Integer,String>> it3 = map.entrySet().iterator();
		
		while(it3.hasNext()) {
			Map.Entry<Integer, String> entry= it3.next();
			System.out.println(entry.getKey() + ", " + entry.getValue());
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
