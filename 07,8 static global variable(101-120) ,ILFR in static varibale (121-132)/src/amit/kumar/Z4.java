package amit.kumar;

class Z4
{
	static int i = test1();

	static int test1()
	{
		System.out.println("from test");
		return 10;
	}

	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(test1());
	}
}
