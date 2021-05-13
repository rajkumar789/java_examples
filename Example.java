class Example{
	public static void main(String args[]){
		try{
			System.out.println(10/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
		finally
		{
			System.out.println("Hello");
		}
	}
}