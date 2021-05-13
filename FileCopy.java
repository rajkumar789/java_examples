import java.io.*;
public class FileCopy
{
	public static void main(String args[])
	throws IOException
	{
		// making new object of file reader
		FileReader fr = new FileReader("E:\\file.txt");

		// getting 50 characters in array
		char[]a=new char[50];

		// reading content of the file stored in array a
		fr.read(a);

		// printing the content of the file
		System.out.println(a);

		// closing the file
		fr.close();

		// making copy of the same fiile in another locatio using file writer
		FileWriter fw = new FileWriter("E:\\copy.txt");
		fw.write(a);
		fw.close();
	}
}