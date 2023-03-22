package swaping;

public class Y {
	int age;

	public static void main(String[] args) {
		Y y1 = new Y();
		Y y2 = new Y();

		System.out.println("y1->" + y1.age);
		System.out.println("y2->" + y2.age);

		y1.age = 10;
		y2.age = 20;

		System.out.println("Before swapping");
		System.out.println("y1->" + y1.age);
		System.out.println("y2->" + y2.age);

		swap(y1, y2);
		System.out.println("After swapping");
		System.out.println("y1->" + y1.age);
		System.out.println("y2->" + y2.age);
	}

	public static void swap(Y y1, Y y2) {
		int temp;
		temp = y1.age;
		y1.age = y2.age;
		y2.age = temp;
	}
}
