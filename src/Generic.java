//6월 7일 - 9
public class Generic<T> {

	T[] v;
	
	void set(T[] n) {
		v = n;
	}
	
	T[] get() {
		return v;
	}

	void print() {
		for(T o: v) {
			System.out.println(o);
		}
	}
}
