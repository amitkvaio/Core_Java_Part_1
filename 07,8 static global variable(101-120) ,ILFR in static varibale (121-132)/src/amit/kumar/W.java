package amit.kumar;

public class W {
	static int i = 10;
	static int j = test();

	static int test() {
		System.out.println("from test");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("From main");
		System.out.println(i);
		System.out.println(j);
	}
}
