package quiz;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import quiz.options.QuizOption;
import quiz.questions.QuizQuestion;

@XmlRootElement(name = "quiz")
public class Quiz
{
    private String title;
    
    private String ident;
    
    private List<QuizOption> options;
    
    private List<QuizQuestion> questions;

    @XmlAttribute
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @XmlAttribute
    public String getIdent()
    {
        return ident;
    }

    public void setIdent(String ident)
    {
        this.ident = ident;
    }

    @XmlElementWrapper(name = "options")
    @XmlElement(name = "option")
    public List<QuizOption> getOptions()
    {
        return options;
    }

    public void setOptions(List<QuizOption> options)
    {
        this.options = options;
    }

    @XmlElementWrapper(name = "questions")
    @XmlElement(name = "question")
    public List<QuizQuestion> getQuestions()
    {
        return questions;
    }

    public void setQuestions(List<QuizQuestion> questions)
    {
        this.questions = questions;
    }
}
