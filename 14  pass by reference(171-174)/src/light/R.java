package light;

public class R {
	int i;

	// We can change the r1 with any identifier
	static void test(R r1) {
		r1.i = 20;
	}

	public static void main(String[] args) {
		R r1 = new R();
		r1.i = 10;
		System.out.println("A:" + r1.i);
		test(r1);
		System.out.println("B:" + r1.i);
	}
}
/*
Objects in Java are passed by reference, which means the method test can alter the state of r1 directly. 
Hence, after the method call, r1.i gets updated to 20.
*/