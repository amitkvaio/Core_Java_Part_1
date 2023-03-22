package lara.athis;

public class I {
	int value = 100;

	public I() {
		H h = new H(this);
		h.display();
	}

	public static void main(String[] args) {
		I h = new I();
		System.out.println("Done");
	}
}
