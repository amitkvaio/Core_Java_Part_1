package amit.kumar;

public class D {
	int i;
	int j = 20;

	D() {
		System.out.println("D()");
		i = 10;
		// initialize 1 value to 10
	}

	public static void main(String[] args) {
		D d1 = new D();
		System.out.println("..........");
		System.out.println(d1.i);
		System.out.println(d1.j);
	}

}
//through constructor we can initialize any of the non static member