public class Question {
    // Fields
    private int id;
    private String questionText;
    private Option[] options = new Option[4]; 

    // Constructor
    public Question(int id, String questionText, Option[] options)
    {
        this.id = id;
        this.questionText = questionText;
        setOptions(options); // Use the setter to validate options
    }


    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public Option[] getOptions() {
        return options;
    }
    public void setOptions(Option[] options)
    {
        // Check if the options array has exactly 4 elements
        if (options.length != 4)
        {
            throw new IllegalArgumentException("There must be exactly 4 options.");
        }

        // Check if the options array contains at least one correct answer
        int correctAnswerCount = 0;
        for (Option option : options)
        {
            if (option.isAnswer())
            {
                correctAnswerCount++;
            }
        }
        if (correctAnswerCount == 0)
        {
            throw new IllegalArgumentException("There must be at least one correct answer.");
        }
        else if (correctAnswerCount > 1)
        {
            throw new IllegalArgumentException("There can be only one correct answer.");
        }

        // If the checks pass, set the options
        this.options = options;

    }

}
