package amit;

public class R {
	static int test(int i) {
		return i--;
	}

	public static void main(String[] args) {
		int i = 0;
		System.out.println(test(i++));
		System.out.println(i);
		i = 0;
		System.out.println(test(i--));
		System.out.println(i);
	}
}
