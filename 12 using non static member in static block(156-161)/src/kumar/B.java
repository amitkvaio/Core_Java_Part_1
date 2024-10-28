package kumar;

class B {
	// void test()
	static void test() {
		System.out.println("static");
	}

	public static void main(String[] args) {
		test();
		System.out.println("hello world");
	}
}

// If we write only void test() then compile will gives the error message
// because we are calling non static method in the static main method.