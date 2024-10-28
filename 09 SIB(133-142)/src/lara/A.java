package lara;

public class A {
	static {
		System.out.println("SIB");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
}


/*
static initialization block (SIB)
------------------------------
It is comes under one of the initializer.
Every SIB  are executing before the main method.
First SIB will be executing then main() will be executed.
Before main method SIB will be executing top to bottom
	no matter where SIB is there in the class, after SIB main() will be executing .
Before executing main() all SIB will be executing  top to bottom.
SIB is executing only once while class is loading.
*/