//182
package amit.kumar;

public class C {
	int i;

	public C() {
		System.out.println(i);
		System.out.println("c()");
		i = 10;
	}

	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(".............");
		System.out.println(c1.i);
	}
}
//What is the access specifier of constructor?
//Access specifier of the constructor is the class access specifier.
//Through constructor we are initialing i value to 10.
//All non static members are loading in the heap memory while object is creating. 
//Constructor also execute at that time also
//Constructor is one of the initializer block all non static member will be initialize.
