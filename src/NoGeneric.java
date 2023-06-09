//6월 7일 - 5
public class NoGeneric {
	Object[] v;
	
	void set(Object[] n) {
		v = n;
	}
	
	Object[] get() {
		return v;
	}

	void print() {
		for(Object o: v) {
			System.out.println(o);
		}
	}


















}
