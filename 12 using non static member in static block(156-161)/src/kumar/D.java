package kumar;

class D {

	// void test1()
	static void test1() {
		System.out.println("FROM TEST1");
	}

	// void test2()
	static void test2() {
		test1();
		System.out.println("test test2");
	}
}

// Remove the static from the test1() method.then it give CTE..
