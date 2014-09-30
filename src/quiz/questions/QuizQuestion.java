package quiz.questions;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "question")
public class QuizQuestion
{
    private String type;
    
    private String text;
    
    public QuizQuestion(){}
    
    public QuizQuestion(String type, String text)
    {
        this.type = type;
        this.text = text;
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
    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }
}
