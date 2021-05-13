class ThreadOne extends Thread
{
	public void run()
	{
		for (int i = 0; i<5;i++)
		{
			System.out.println("Thread one"+i);
		}
		System.out.println("Exit from thread one");
	}
}
class ThreadTwo extends Thread
{
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			System.out.println("Thread two"+i);
		}
		System.out.println("Exit form thread two");
	}
}
class TestThread
{
	public static void main(String args[])
	{
		ThreadOne obj1 = new ThreadOne();
		ThreadTwo obj2 = new ThreadTwo();
		obj1.start();
		obj2.start();
	}
}