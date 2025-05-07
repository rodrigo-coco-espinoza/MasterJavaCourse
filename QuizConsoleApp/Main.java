
public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Quiz Console App!");
        QuestionService questionService = new QuestionService();
        questionService.displayQuestions();
    }
}