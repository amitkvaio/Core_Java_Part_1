//101
package amit.kumar;

public class A {
	static int i;// default value is zero;

	public static void main(String[] args) {
		int i = 200;
		System.out.println(i);
		i = 100;
		System.out.println(i);
		i = 200;
		System.out.println(i);
	}
}

/*
Static variable are the global variable it does not required to initialized.
Static variable having the default value according to their data type. 
Global variable can be reinitialized again and again.

Global variable can be used any of the method throughout the current class.
Local variable get more preference then global variable. 
Global variable does not required  to initialize explicitly before usages.
Global variable can be modified anywhere within the current class.

*/