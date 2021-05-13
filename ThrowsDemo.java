public class ThrowsDemo{
	int division(int a,int b) throws ArithmeticException
	{
		int t = a/b;
		return t;
	}
	public static void main(String args[]){
		ThrowsDemo obj = new ThrowsDemo();
		try{
			System.out.println(obj.division(15,5));
		}
		catch(ArithmeticException e){
			System.out.println("Exception:"+e.getMessage());
		}
	}
}
