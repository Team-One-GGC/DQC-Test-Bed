package zip;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class ZipWriter
{
	private static final String FOLDER_PATH = "C:/Users/Derek/Desktop/SoftDev/";
	
	private FileOutputStream fos;
	private ZipOutputStream zos;
	
	public ZipWriter(String zipName) throws IOException
	{
		fos = new FileOutputStream(FOLDER_PATH + zipName);
		zos = new ZipOutputStream(fos);
	}
	
	public void writeToZip(String fileName)
	{
		byte[] buffer = new byte[1024];
		try {
			ZipEntry zipEntry = new ZipEntry(fileName);
			zos.putNextEntry(zipEntry);
			FileInputStream in = new FileInputStream(FOLDER_PATH + fileName);
			
			int len;
			while((len = in.read(buffer)) > 0)
			{
				zos.write(buffer, 0, len);
			}
			
			zos.closeEntry();
			in.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeStreams()
	{
		try {//Important the ZipOutputStream must be closed before the FileOutputStream
			zos.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
