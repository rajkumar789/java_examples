import java.io.*;
public class FileInputStreamExample
{
	public static void main(String args[])
	{
		try{
			FileInputStream fin = new FileInputS020 ntream("E:\\file.txt");
			int i = 0;
			while ((i = fin.read())!=-1)
				System.out.println((char)i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}