package manifest;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ManifestRunner
{
	private static final String MANIFEST_XML = "C:/Users/Derek/Desktop/SoftDev/imsmanifest.xml";
	public static void main(String[] args) throws JAXBException
	{
		JAXBContext context = JAXBContext.newInstance(Manifest.class);
		marshall(context);
//		unmarshall(context);
		
	}

	public static void marshall(JAXBContext context) throws JAXBException
	{
		ArrayList<ManifestResource> res = new ArrayList<ManifestResource>();

		ManifestResource mr = new ManifestResource();
		mr.setIdentifier("example");
		mr.setType("webcontent");
		mr.setMaterial_type("d2lquiz");
		mr.setLink_target("");
		mr.setHref("example.xml");
		mr.setTitle("This is an example title");
		res.add(mr);

		Manifest m = new Manifest();
		m.setIdentifier("Some crap");
		m.setResources(res);

		Marshaller marsh = context.createMarshaller();
		marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		marsh.marshal(m, System.out);
	}
	
	public static void unmarshall(JAXBContext context) throws JAXBException
	{
		Unmarshaller unmarsh = context.createUnmarshaller();
		Manifest m = (Manifest) unmarsh.unmarshal(new File(MANIFEST_XML));
		ArrayList<ManifestResource> res = m.getResources();
		for(ManifestResource r : res)
		{
			String ident = r.getIdentifier();
			String href = r.getHref();
			String title = r.getTitle();
			System.out.println("Identifier: " + ident);
			System.out.println("Href: " + href);
			System.out.println("Title: " + title);
		}
	}
}
