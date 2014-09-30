package quiz.options;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "option")
public class QuizOption
{
    private String type;
    
    private String value;
    
    public QuizOption(){}
    
    public QuizOption(String type, String value)
    {
        this.type = type;
        this.value = value;
    }

    @XmlAttribute(name = "type", namespace = "my.custom.namespace")
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @XmlValue
    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
