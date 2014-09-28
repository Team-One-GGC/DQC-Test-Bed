package zip;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


public class ZipReader
{
	private static final String FOLDER_PATH = "C:/Users/Derek/Desktop/SoftDev/";
	private ZipFile zip;
	
	public ZipReader(String zipName) throws IOException
	{
		zip = new ZipFile(FOLDER_PATH + zipName);
	}
	
	/**
	 * Here we meet return an InputStream to be passed to a Scanner so we can read the contents
	 * of a file line by line
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public InputStream readFromZip(String fileName) throws IOException
	{
		Enumeration<? extends ZipEntry> zippedFiles = zip.entries();
		while(zippedFiles.hasMoreElements())
		{
			ZipEntry entry = zippedFiles.nextElement();
			
			if(entry.getName().equals(fileName))
			{
				return zip.getInputStream(entry);
			}
		}
		return null;
	}
	
	public void closeStreams()
	{
		try {
			zip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
