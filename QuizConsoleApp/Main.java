
public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Quiz Console App!");
        System.out.println();
        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.displayScore();
        System.out.println();
        System.out.println("Thank you for playing!");
    }
}