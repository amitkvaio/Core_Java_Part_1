package lara;

public class I
{
	static int i = test();
	static
	{
		System.out.println("sib1");
	}
	static int test()
	{
		System.out.println("Test()-i-->"+i);
		System.out.println("TEST");
		return 10;

	}
	public static void main(String[] args)
	{
		System.out.println("done");
		System.out.println(i);
	}
	static
	{
		System.out.println("sib2");
	}
}


/*
ALL STATIC INITIALIZER EXECUTION IS TOP TO BOTTOM BEFORE CLASS EXECUTION
*/