package testclass;

public class Test extends Thread implements Runnable
{
	public void run()
	{
		System.out.println("Yes I am in run");
	}


	public static void main(String[] args) throws InterruptedException
	{
//		Test obj = new Test();
//	    obj.run();
//		obj.join();
//		System.out.println("called join");
//		obj.start();
//		System.out.println("called start");

		test(null);

	}

	public static void test(String s)
	{
		System.out.println("String");
	}
	public static void test(Object o)
	{
		System.out.println("Object");
	}

}
