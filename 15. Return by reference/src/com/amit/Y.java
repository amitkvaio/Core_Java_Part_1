package com.amit;

public class Y {
	int i;
	
	public static Y test(Y y) {
		System.out.println("value of y inside the test ::"+y.i);
		y.i = 20;
		System.out.println("value of y inside the test after initialization ::"+y.i);
		return y;
	}
	
	public static void main(String[] args) {
		Y y = new Y();
		System.out.println("value of y before initialization ::"+y.i);
		y.i = 10;
		System.out.println("value of y after initialization ::"+y.i);
		Y y1 = test(y);
		System.out.println("value of y after calling test function ::"+y1.i);
	}
}
