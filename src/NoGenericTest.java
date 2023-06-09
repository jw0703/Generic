//6월 7일 - 6
public class NoGenericTest {

	public static void main(String[] args) {
		
		NoGeneric noGeneric = new NoGeneric();
		
		String[] name = {"Hong","Kim"};
		//Integer[] integer = {new Integer(1),new Integer(2)};
		
		noGeneric.set(name);
		
		Object[] v = noGeneric.get();
		String[] ss = (String[])v;  //캐스팅을 해야 된다!!
	
		System.out.println(v[0]);
		System.out.println(v[1]);
	
		Integer[] integers = {1,2};
		noGeneric.set(integers);
		
		Object[] v2=noGeneric.get();
		Integer[] ii = (Integer[])v2;
		System.out.println(ii[0]);
		System.out.println(ii[1]);
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
