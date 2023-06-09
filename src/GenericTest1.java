//6월 7일 - 10
public class GenericTest1 {

	public static void main(String[] args) {
		Generic<String> g1 = new Generic<String>();  //String 타입만 받겠다
		
		String[] name = {"hong","kim"};
		g1.set(name);
		String[] v= g1.get();
	
		System.out.println(v[0]);
	
		
		Generic<Integer> g2 = new Generic<Integer>();
		Integer[] it = {1,2,3};
		g2.set(it);
	
		System.out.println(it[0]);
	
	}

}
