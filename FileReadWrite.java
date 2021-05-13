import java.io.*;
public class FileReadWrite
{
	public static void main(String agrs[])
	throws IOException
	{
		FileWriter fw = new FileWriter("E:\\test.txt");
		fw.write("Hello! World");
		fw.close();
		FileReader fr = new FileReader("E:\\test.txt");
		char[]a = new char[50];
		fr.read(a);
		System.out.println(a);
		fr.close();
	}

}