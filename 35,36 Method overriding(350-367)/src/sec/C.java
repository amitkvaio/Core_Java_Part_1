package sec;

class C {
	double test() {
		System.out.println("from test");
		return 20.90;
	}
}

class D extends C {
	// int test()
	double test() {
		System.out.println("from test");
		return 10;
	}
}

//Return type should be the same