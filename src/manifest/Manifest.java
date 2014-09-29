package manifest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "manifest")
public class Manifest
{
	private String identifier;
	
	private List<ManifestResource> resources;

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
	public List<ManifestResource> getResources()
	{
		return resources;
	}

	public void setResources(List<ManifestResource> res)
	{
		this.resources = res;
	}
}
