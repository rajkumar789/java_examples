class Test implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\nTest Thread");
		}
	}
}
class main
{
	public static void main(String arga[])
	{
		Test t1 = new Test();
		Thread obj = new Thread(t1);
		obj.start();
		for (int i = 1; i<=5;i++)
		{
			System.out.println("\n Main Thread");
		}
	}
}