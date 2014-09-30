package quiz;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import quiz.options.QuizOption;
import quiz.questions.QuizQuestion;

public class QuizRunner
{
    public static void main(String[] args) throws JAXBException
    {
        JAXBContext context = JAXBContext.newInstance(Quiz.class);
        
        Quiz quiz = new Quiz();
        quiz.setIdent("quiz_1");
        quiz.setTitle("My Example Quiz");
        quiz.setOptions(getOptions());
        quiz.setQuestions(getQuestions());
        
        Marshaller marsh = context.createMarshaller();
        marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        
        marsh.marshal(quiz, System.out);
    }
    
    public static List<QuizOption> getOptions()
    {
        List<QuizOption> options = new ArrayList<>();
        options.add(new QuizOption("start-time", "10:00AM"));
        options.add(new QuizOption("end-time", "11:30AM"));
        options.add(new QuizOption("weight", "50"));
        return options;
    }
    
    public static List<QuizQuestion> getQuestions()
    {
        List<QuizQuestion> questions = new ArrayList<>();
        questions.add(new QuizQuestion("MC", "Multiple Choice"));
        questions.add(new QuizQuestion("TF", "True False"));
        questions.add(new QuizQuestion("LA", "Long Answer"));
        return questions;
    }
}
