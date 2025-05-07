
public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Quiz Console App!");
        System.out.println();
        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
    }
}