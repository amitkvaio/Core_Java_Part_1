package lara.athis;

public class H {
	I obj;
	public H(I obj) {
		this.obj=obj;
	}
	
	public void display() {
		System.out.println("From display()::"+obj.value);
	}
}
/*
6) this: to pass as argument in the constructor call

*/
