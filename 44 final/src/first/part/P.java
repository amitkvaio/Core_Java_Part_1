package first.part;

class P {
	int i = 10;

	public static void main(String[] args) {
		final P p1 = new P();
		p1.i = 10;// modifying i not P1
		System.out.println("done");
	}
}
