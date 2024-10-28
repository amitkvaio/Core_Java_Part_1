class B {
	public static void main(String[] args) {
		int i = 0;
		System.out.println(i--);
		System.out.println(i);
		// i--;
		// i=i-1;
		// i=-1-1=-2 after calculating the value of in the RHS the value is assign to i
	}
}

/*
Printing the i values at line number 4 -  that is we are using the i value.
So first it will use the older value - it will print the older values
then it will decrement the i values
*/
