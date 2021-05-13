import java.io.*;
import java.net.*;
public class Client
{
	public static void main(String[] args) throws Exception
	{	
	try{					
		System.out.println("Client...\n");

		// opening port 
		Socket con = new Socket("localhost",98);

		// creating class of BufferReader
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		PrintWriter out = new PrintWriter(con.getOutputStream(), true);
		while (true){
		System.out.println("Enter the radius of circle:");
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(din.readLine());
		// int area = Integer.parseInt(din.readLine());
		// System.out.println("The area of circle is: " + area);

	}
		in.close();
		out.close();
		con.close();
	}
	catch(UnknownHostException e)
	{
		System.out.println("Error:"+ e);
	}
}
}