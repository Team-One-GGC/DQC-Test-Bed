package zip;
import java.io.IOException;
import java.util.Scanner;


public class ZipRunner
{	
	public static void main(String[] args) 
	{		
		testZipReader();
//		testZipWriter();
		System.out.println("Done");
	}
	
	public static void testZipReader()
	{
		try {
			ZipReader reader = new ZipReader("testquiz.zip");
			Scanner scan = new Scanner(reader.readFromZip("imsmanifest.xml"));
			while(scan.hasNextLine())
			{
				System.out.println(scan.nextLine());
			}
			scan.close();
			reader.closeStreams();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void testZipWriter()
	{
		ZipWriter writer;
		try {
			writer = new ZipWriter("testzip.zip");
			writer.writeToZip("imsmanifest.xml");
			writer.writeToZip("quiz_d2l_928327.xml");
			writer.closeStreams();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
