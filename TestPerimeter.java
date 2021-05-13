import java.util.Scanner;
class Perimeter
{
	int r,l,b,s1,s2,s3,p,t,rt,si;
	double pi = 3.1416, perimeter;
	Scanner sk = new Scanner(System.in);

	void circle()
	{
		System.out.println("Enter the raius of circle:");
		r = sk.nextInt();
		perimeter = 2*pi*r;
		System.out.println("Perimeter of circle is" +perimet er);
	}
	void rectangle()
	{
		System.out.println("Enter the lenght of rectangle");
		l = sk.nextInt();
		System.out.println("Enter the breadth of rectange");
		b = sk.nextInt();
		perimeter = 2*(l+b);
		System.out.println("The perimeter of rectangle is"+perimeter);
	}
	void triangle()
	{
		System.out.println("Enter the first side of triangle");
		s1 = sk.nextInt();
		System.out.println("Enter the second side of triangle");
		s2 = sk.nextInt();
		perimeter = s1+s2+s3;
		System.out.println("The perimeter of triangle is"+perimeter);
	}
	void SimpleInterest()
	{
		System.out.println("Enter Principle");
		p = sk.nextInt();
		System.out.println("Enter Time");
		t = sk.nextInt();
		System.out.println("Enter the Rate");
		rt = sk.nextInt();
		si = (p*t*rt)/100;
		System.out.println("The simple interest is"+si);
	}
}
public class TestPerimeter{
	public static void main(String args[])
	{
		Perimeter p1 = new Perimeter();
		p1.circle();
		p1.rectangle();
		p1.triangle();
		p1.SimpleInterest();
	}
}