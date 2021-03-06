package manifest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "resource")
public class ManifestResource
{
	private String identifier;
	private String type;
	private String material_type;
	private String link_target;
	private String href;
	private String title;
	
	@XmlAttribute
	public String getIdentifier()
	{
		return identifier;
	}
	
	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}
	
	@XmlAttribute
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	@XmlAttribute(name = "material_type", namespace = "http://desire2learn.com/xsd/d2lcp_v2p0")
	public String getMaterial_type()
	{
		return material_type;
	}
	
	public void setMaterial_type(String material_type)
	{
		this.material_type = material_type;
	}
	
	@XmlAttribute(name = "link_target", namespace = "http://desire2learn.com/xsd/d2lcp_v2p0")
	public String getLink_target()
	{
		return link_target;
	}
	public void setLink_target(String link_target)
	{
		this.link_target = link_target;
	}
	
	@XmlAttribute
	public String getHref()
	{
		return href;
	}
	public void setHref(String href)
	{
		this.href = href;
	}
	
	@XmlAttribute
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
}
