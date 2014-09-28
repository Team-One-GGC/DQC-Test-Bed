package manifest;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "manifest")
public class Manifest
{
	private String identifier;
	
	private ArrayList<ManifestResource> resources;

	@XmlAttribute
	public String getIdentifier()
	{
		return identifier;
	}

	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}

	@XmlElementWrapper(name = "resources")
	@XmlElement(name = "resource")
	public ArrayList<ManifestResource> getResources()
	{
		return resources;
	}

	public void setResources(ArrayList<ManifestResource> resources)
	{
		this.resources = resources;
	}
}
