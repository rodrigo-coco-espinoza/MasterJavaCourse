import java.util.Scanner;

public class QuestionService 
{
    Question questions[] = new Question[5];
    int answers[] = new int[5];

    public QuestionService()
    {
        questions[0] = new Question(
            1,
            "When was Nintendo founded?",
            new Option[] {
                new Option("1889", true),
                new Option("1989", false),
                new Option("1999", false),
                new Option("2000", false)
            }
        );
        questions[1] = new Question(
            2,
            "What is the first video game ever made?",
            new Option[] {
                new Option("Tetris", false),
                new Option("Pong", false),
                new Option("Space Invaders", false),
                new Option("Tennis for Two", true)
            }
        );
        questions[2] = new Question(
            3,
            "What is the best-selling video game of all time?",
            new Option[] {
                new Option("Tetris", false),
                new Option("Minecraft", true),
                new Option("Wii Sports", false),
                new Option("Grand Theft Auto V", false)
            }
        );
        questions[3] = new Question(
            4,
            "Who are the creators of Doom?",
            new Option[] {
            new Option("John Carmack and John Romero", true),
            new Option("Shigeru Miyamoto and Takashi Tezuka", false),
            new Option("Hideo Kojima and Yoji Shinkawa", false),
            new Option("Sid Meier and Bruce Shelley", false)
            }
        );
        questions[4] = new Question(
            5,
            "Which of the following is not a Zelda character?",
            new Option[] {
                new Option("Saria", false),
                new Option("Urbosa", false),
                new Option("Impa", false),
                new Option("Nia", true)
            }
        );
    }

    public void displayQuestion(Question question)
    {       
        System.out.println("Question " + question.getId() + ": " + question.getQuestionText());
        for (int i = 0; i < question.getOptions().length; i++)
        {
            System.out.println((i + 1) + ". " + question.getOptions()[i].getText());
        }        
    }

    public int getAnswer(Question question)
    {
        boolean validInput = false;
        int answer;
        System.out.print("Enter your answer (1-" + question.getOptions().length + "): ");
        do
        {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            try
            {
                answer = Integer.parseInt(input);
                if (answer >= 1 && answer <= question.getOptions().length)
                {
                    validInput = true;
                    System.out.println();
                    return answer - 1; // Adjust for zero-based index
                }
                else
                {
                    System.out.print("Invalid input. Please enter a number between 1 and " + question.getOptions().length + ": ");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.print("Invalid input. Please enter a number between 1 and " + question.getOptions().length + ": ");
            }
        }
        while (!validInput);

        return -1; // This line will never be reached due to the loop condition
    }

    public void playQuiz()
    {
        int answerIndex = 0;
        for (Question question : questions)
        {
            displayQuestion(question);
            // Get user input for the answer
            answers[answerIndex] = getAnswer(question);
            answerIndex++;
        }
        
    }

    public void displayScore()
    {
        int score = 0;

        System.out.println("Your answers are:");
        for (int i = 0; i < answers.length; i++)
        {
            System.out.println("Question " + (i + 1) + ": " + questions[i].getOptions()[answers[i]].getText() + " (" + questions[i].getOptions()[answers[i]].isAnswer() + ")");

            if (questions[i].getOptions()[answers[i]].isAnswer())
            {
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
    }
}