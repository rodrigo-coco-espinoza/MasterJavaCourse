public class QuestionService 
{
    Question [] questions = new Question[5];

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

    public void displayQuestions()
    {
        for (Question question : questions)
        {
            System.out.println("Question " + question.getId() + ": " + question.getQuestionText());
            for (int i = 0; i < question.getOptions().length; i++)
            {
                System.out.println((i + 1) + ". " + question.getOptions()[i].getText());
            }
            System.out.println();
        }
    }
}