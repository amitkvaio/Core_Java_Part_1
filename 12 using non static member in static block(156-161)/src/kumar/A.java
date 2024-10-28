package kumar;

public class A {
	static int i;

	// int J;
	public static void main(String[] args) {
		System.out.println(A.i);
	}
}

/*
If we write only int i; and compile then it gives the error message because non
	static variable i can not be referenced from static context;

At the time of class loading, all static member as well get loaded in the memory 
	But non static member loaded in the memory when we create the object of that class.

Static bloc executed only ones for each class load.
*/