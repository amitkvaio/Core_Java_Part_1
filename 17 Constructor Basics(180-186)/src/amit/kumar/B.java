package amit.kumar;

//181
class B {

	public B() {
		System.out.println("B()");
	}

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(".........");
		B b2 = new B();
		System.out.println("..........");
	}
}

//Constructor will automatic call while object is creating.
