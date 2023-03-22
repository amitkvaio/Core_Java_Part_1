package light;

public class R {
	int i;

	// we can change the r1 with any identifier
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
